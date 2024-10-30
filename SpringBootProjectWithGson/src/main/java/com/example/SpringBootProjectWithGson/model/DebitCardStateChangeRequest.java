package com.example.SpringBootProjectWithGson.model;

import java.util.Date;
import java.util.UUID;

import org.springframework.format.annotation.DateTimeFormat;

public class DebitCardStateChangeRequest {

	private DebitCardStateChange stateChange;
	
	private UUID id;
	
	private String token;
	
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE_TIME)
	private Date timestamp;

	public DebitCardStateChange getStateChange() {
		return stateChange;
	}

	public void setStateChange(DebitCardStateChange stateChange) {
		this.stateChange = stateChange;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
}
