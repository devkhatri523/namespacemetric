package com.example.springmongodb.model;

import lombok.Data;

@Data
public class Result {
    private Metric metric;
    private String value;

    @Override
    public String toString() {
        StringBuilder buildString = new StringBuilder();
        buildString.append("{");
        if (getMetric() != null) {
            buildString.append(metric.toString());
            buildString.append(",");
        }
        if (getValue() != null) {
            buildString.append(value);
        } else {
            buildString.append("}");
        }
        return buildString.toString();
    }
}
