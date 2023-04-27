package com.fredsonchaves07.domain.entities;

public class Model {

    private String name;

    private int maxTokens;

    public Model(String name, int maxTokens) {
        this.name = name;
        this.maxTokens = maxTokens;
    }

    public String getName() {
        return name;
    }

    public int getMaxTokens() {
        return maxTokens;
    }
}
