#!/usr/bin/env bash

## Build script for infra utils

APP_VERSION="1.0.0"

function usage()
{
    cat <<EOF
Usage: build.sh [options]
Builds cwp-collector-models
Options:
  -h, --help               Show this help message and exit.
  --jenkins                To be used when triggering builds from jenkins.
  --dev                    Local development builds to build the app and the docker image.
  --build                  Builds repository using docker.
  --run_tests              Build and runs unit/integration tests.
  --snapshot               Deploys the artifacts to maven snapshot repository
  --release                Deploys the artifacts to maven release repository
  --rmi                    Cleans up the docker image.
  --bes                    Triggering builds on IT executors
EOF
}

jenkins=false
dev=false
snapshot=false
build=false
run_tests=false
release=false
rmi=false
bes=false
while [ $# -gt 0 ]; do
    arg="$1"
    shift
    case "$arg" in
        -h|--help|help)
            usage
            exit 0;;
        --jenkins)
             jenkins=true
             ;;
        --dev)
            dev=true
            ;;
        --build)
            build=true
            ;;
        --run_tests)
            run_tests=true
            ;;
        --snapshot)
            snapshot=true
            ;;
        --release)
            release=true
            ;;
        --rmi)
            rmi=true
            ;;
        --bes)
            bes=true
	    ;;
        *)
            error "Unknown option."
            usage
            exit 0;;
    esac
done


validateNotEmpty () {
    if [[ (${!1} == "") ]]; then
        echo variable $1 is empty, cancelling
        exit 1
    fi
}

if [ ${bes} = true ]; then
    DOCKER_CMD="sudo docker "
else
    DOCKER_CMD="docker "
fi

GRADLE_BUILD="gradlew clean build --refresh-dependencies --rerun-tasks"
GRADLE_PUBLISH="gradlew publish --refresh-dependencies --rerun-tasks"

if [ ${jenkins} = true ] || [ ${dev} = true ]; then

    echo "Building cwp-collector-models package inside docker"
    # Create build container
    ${DOCKER_CMD} build --file ./ci/Dockerfile.build -t cwp-models-build .
    if [[ $? -ne 0 ]]; then
        echo "Docker build image creation failed!!!"
        exit 1
    fi

    if [ ${build} = true ]; then
        # run builds and unit tests
        #${DOCKER_CMD} run --platform linux/amd64 --rm -v $(pwd):/ws --name design-vis-builder design-vis-build ./${GRADLE_BUILD}
        ${DOCKER_CMD} run --rm -v "$(pwd)":/ws --name cwp-models-builder cwp-models-build ./${GRADLE_BUILD}
    fi

    if [ ${snapshot} = true ]; then
        echo "Running docker for build and snapshot"
        export MIN_VERSION=0
        #GRADLE_CMD="gradlew publish --refresh-dependencies --rerun-tasks -Prelease=true"
        GRADLE_CMD="gradlew build publish --refresh-dependencies --rerun-tasks"
        ${DOCKER_CMD} run --rm -v "$(pwd)":/ws --name cwp-models-builder cwp-models-build ./${GRADLE_CMD}

    fi

    if [ ${release} = true ]; then
        last_minor_ver=$(curl -s -u wae.gen:'${PWD}' https://engci-maven-master.cisco.com/artifactory/wae-release/com/cisco/cwplanning/wae-collector-models/maven-metadata.xml | xmllint --xpath '//metadata/versioning/latest/text()' - | cut -f 4 -d .)
        echo "Last minor version: ${last_minor_ver}"
        new_minor_ver=`expr $last_minor_ver + 1`
        echo "New minor version: ${new_minor_ver}"
        GRADLE_CMD="gradlew clean build publish --refresh-dependencies --rerun-tasks -Prelease=true -PminVer=${new_minor_ver}"
        echo "Running: $GRADLE_CMD"
        ${DOCKER_CMD} run --rm -v "$(pwd)":/ws --name cwp-models-builder-builder cwp-models-build ./${GRADLE_CMD}
    fi

    if [[ $? -ne 0 ]]; then
        echo "Build failed!!!"
        exit 1
    fi

    # cleanup build image
    ${DOCKER_CMD} rmi cwp-models-build
    if [[ $? -ne 0 ]]; then
        echo "Cleanup of docker images failed!!!"
        #exit 1
    fi
    exit 0
fi

else
    echo ""
    echo "Starting build"
    ./${GRADLE_BUILD}
    echo "Skipping docker image generation"
fi

