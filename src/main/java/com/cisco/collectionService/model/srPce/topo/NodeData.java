package com.cisco.collectionService.model.srPce.topo;


import com.cisco.collectionService.model.srPce.SrPceData;
import com.cisco.collectionService.model.srPce.topo.link.NetIntXtcAdjacencySids;
import com.cisco.collectionService.model.srPce.topo.link.NetIntXtcLinkKey;
import com.cisco.collectionService.model.srPce.topo.link.NetIntXtcLinks;
import com.cisco.collectionService.model.srPce.topo.link.NetIntXtcSRv6AdjacencySids;
import com.cisco.collectionService.model.srPce.topo.node.*;

import java.util.ArrayList;
import java.util.List;

public class NodeData extends SrPceData {
    NetIntXtcTopoNodes topoNode;
    List<NetIntXtcIGPSRGBInfo> igpsrgbInfo;
    List<NetIntXtcPrefixSids> prefixSids;
    List<NetIntXtcSRv6PrefixSids> SRv6PrefixSids;
    List<NetIntXtcFlexAlgorithms> flexAlgorithms;
    List<NetIntXtcLinks> links;
    List<NetIntXtcLinkKey> linkKeys;
    List<NetIntXtcAdjacencySids> adjacencySids;
    List<NetIntXtcSRv6AdjacencySids> sRv6AdjacencySids;
    public NodeData() {
        igpsrgbInfo = new ArrayList<>();
        prefixSids = new ArrayList<>();
        SRv6PrefixSids = new ArrayList<>();
        links = new ArrayList<>();
        linkKeys = new ArrayList<>();
        adjacencySids = new ArrayList<>();
        sRv6AdjacencySids = new ArrayList<>();
        flexAlgorithms = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "NodeData{" + "topoNode=" + topoNode + '}';
    }

    public NetIntXtcTopoNodes getTopoNode() {
        return topoNode;
    }

    public void setTopoNode(NetIntXtcTopoNodes topoNode) {
        this.topoNode = topoNode;
    }

    public List<NetIntXtcIGPSRGBInfo> getIgpsrgbInfo() {
        return igpsrgbInfo;
    }

    public void addIgpsrgbInfo(List<NetIntXtcIGPSRGBInfo> info) {
        this.igpsrgbInfo.addAll(info);
    }

    public List<NetIntXtcPrefixSids> getPrefixSids() {
        return prefixSids;
    }

    public void addPrefixSids(List<NetIntXtcPrefixSids> prefixSids) {
        this.prefixSids.addAll(prefixSids);
    }

    public List<NetIntXtcSRv6PrefixSids> getSRv6PrefixSids() {
        return SRv6PrefixSids;
    }

    public void addSRv6PrefixSids(List<NetIntXtcSRv6PrefixSids> sRv6PrefixSids) {
        this.SRv6PrefixSids.addAll(sRv6PrefixSids);
    }

    public List<NetIntXtcFlexAlgorithms> getFlexAlgorithms() {
        return flexAlgorithms;
    }

    public void addFlexAlgorithms(List<NetIntXtcFlexAlgorithms> flexAlgorithms) {
        this.flexAlgorithms.addAll(flexAlgorithms);
    }

    public List<NetIntXtcLinks> getLinks() {
        return links;
    }

    public void addLinks(NetIntXtcLinks link) {
        this.links.add(link);
    }

    public List<NetIntXtcLinkKey> getLinkKeys() {
        return linkKeys;
    }

    public void addLinkKeys(NetIntXtcLinkKey key) {
        this.linkKeys.add(key);
    }

    public List<NetIntXtcAdjacencySids> getAdjacencySids() {
        return adjacencySids;
    }

    public void addAdjacencySids(List<NetIntXtcAdjacencySids> adjacencySids) {
        this.adjacencySids.addAll(adjacencySids);
    }

    public List<NetIntXtcSRv6AdjacencySids> getsRv6AdjacencySids() {
        return sRv6AdjacencySids;
    }

    public void addsRv6AdjacencySids(List<NetIntXtcSRv6AdjacencySids> sRv6AdjacencySids) {
        this.sRv6AdjacencySids.addAll(sRv6AdjacencySids);
    }
}
