package com.cisco.configService.model.preConfig;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class NodeListResponse {

    private long validNodeListCount;

    private long invalidNodeListCount;

    private long authMismatchNodListCount;

    private long snmpMismatchNodListCount;

    public boolean getStatus(){
        return invalidNodeListCount == 0 && authMismatchNodListCount == 0 && snmpMismatchNodListCount == 0;
    }
}
