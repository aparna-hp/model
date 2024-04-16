package com.cisco.configService.model.trafficPoller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CPStatusResponse {
	@JsonProperty("started")
	private boolean started;

	public CPStatusResponse(@JsonProperty("started") boolean started) {
		super();
		this.started = started;
	}

	@JsonProperty("started")
	public boolean isStarted() {
		return started;
	}

	@JsonProperty("started")
	public void setStarted(boolean started) {
		this.started = started;
	}

	@Override
	public String toString() {
		return "CPStatusResponse{" +
				"started=" + started +
				'}';
	}
}
