package com.example.springmongodb.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("pod_info")
public class PodMetrices {
    private String namesSpaceName ;
    private List<Metric> metric;
    private String value;
}
