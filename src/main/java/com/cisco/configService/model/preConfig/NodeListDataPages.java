package com.cisco.configService.model.preConfig;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@Data
public class NodeListDataPages {

    private long count;

    private List<NodeListData> nodeLists = new ArrayList<>();
}
