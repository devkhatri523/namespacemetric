package com.example.springmongodb.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("namespace_metrices")
public class ContainerNamespace {
    private String clusterName;
    private List<NameSpaceMetrices> nameSpaceMetrices;
    private String lastUpdatedDate;
}
