package com.cisco.workflowmanager;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

@Getter @AllArgsConstructor
public enum DataCollectorType {
    TOPO_IGP    (1, "topo-igp", "IGP topology", ServiceType.TOPO_IGP),
    TOPO_BGP    (2, "topo-bgp", "BGP topology", ServiceType.TOPO_BGP),
    TOPO_VPN    (3, "topo-vpn", "VPN topology", ServiceType.TOPO_VPN),
    LSP_SNMP    (4, "lsp-snmp", "LSP SNMP", ServiceType.LSP_SNMP),
    LSP_PCEP_XTC(5, "lsp-pcep-xtc", "LSP PCEP XTC", ServiceType.LSP_PCEP_XTC),
    ;
    private long id;
    private String shortName;
    private String descr;
    private ServiceType serviceType;

    @Override
    public String toString() {
        return this.name();
    }

    private static Map<ServiceType, DataCollectorType> serviceMapping = new HashMap<>();
    static {
        for(DataCollectorType type : values()){
            serviceMapping.put(type.getServiceType(), type);
        }
    }

    public static DataCollectorType forServiceType(ServiceType serviceType){
        return serviceMapping.get(serviceType);
    }

}
