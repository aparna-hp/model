package com.cisco.configService.model.composer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NetworkApiResponse {

    Long id;

    List<ApiResponseDetail> responseDetails = new ArrayList<>();
}
