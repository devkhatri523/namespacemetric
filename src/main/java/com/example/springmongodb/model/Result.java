package com.example.springmongodb.model;

import lombok.Data;

@Data
public class Result {
    private Metric metric;
    private String value;

    @Override
    public String toString() {
        return "{" +
                  metric +
                ", " + value + '\'' +
                '}';
    }
}
