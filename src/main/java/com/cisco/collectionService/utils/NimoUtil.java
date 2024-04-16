package com.cisco.collectionService.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class NimoUtil {
    private static final Logger logger = LogManager.getLogger(NimoUtil.class);


    /**
     * Orders the circuit endpoints based on string comparison.
     * Expects the sequence of input parameters to be - nodeA, ifaceA, nodeB, ifaceB
     * <p>
     * Returns  null if all the input parameters are not provided.
     *
     * @param circuitEndPointDetails
     */
    public static List<String> getOrderedCircuitKey(List<String> circuitEndPointDetails) {
        logger.debug("Ordering circuit end points");
        List<String> orderedList = new ArrayList<>();

        //
        if (circuitEndPointDetails.size() != 4) {
            logger.error("Failed to order the circuit endpoints.");
            return orderedList;
        }
        String nodeA = circuitEndPointDetails.get(0);
        String intfA = circuitEndPointDetails.get(1);
        String nodeB = circuitEndPointDetails.get(2);
        String intfB = circuitEndPointDetails.get(3);

        if (nodeA.toLowerCase().compareTo(nodeB.toLowerCase()) < 0 ||
                (nodeA.toLowerCase().compareTo(nodeB.toLowerCase()) == 0 &&
                        (intfA.toLowerCase().compareTo(intfB.toLowerCase())) < 0)) {
            return circuitEndPointDetails;
        }
        orderedList.add(nodeB);
        orderedList.add(intfB);
        orderedList.add(nodeA);
        orderedList.add(intfA);
        return orderedList;
    }
}
