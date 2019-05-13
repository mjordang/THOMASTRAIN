package com.train.batchtrain.exception;

public enum Errors {

    ILLEGAL_NUMBER_ARGUMENTS("00001", "At least one pair of origin and destination is needed"),
    ILLEGAL_ARGUMENTS("00002", "The available cities are A,B,C,D,E");
	
	
	
    private final String code;
    private final String description;

    private Errors(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String toString() {
        return code + ": " + description;
    }
}
