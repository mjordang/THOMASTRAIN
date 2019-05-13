package com.train.batchtrain.exception;

public enum Errors {

    ILLEGAL_NUMBER_ARGUMENTS("At least one pair of origin and destination is needed"),
    ILLEGAL_ARGUMENTS("The available cities are A,B,C,D,E");
	
	
    private final String description;

    private Errors(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}