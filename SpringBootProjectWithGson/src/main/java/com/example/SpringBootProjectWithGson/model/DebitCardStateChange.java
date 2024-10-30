package com.example.SpringBootProjectWithGson.model;

public enum DebitCardStateChange {

	LOCK("lock"), UNLOCK("unlock");

	private String value;

	DebitCardStateChange(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
