package com.example.springmongodb.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("pod_info")
public class PodMetrices {
    private String clusterName;
    private String ait;
    private String namespace;
    private String lastUpdatedDate;
    private List<Result> result;
}
