package com.sda.javaee9springex1.controller;

public enum Season {
    WINTER("Beautiful"),
    SUMMER ("Sunny");

    private String description;
    private Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
