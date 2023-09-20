package com.example.springmongodb.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("cont_namespace_info")
public class ContainerNamespace {
    private String clusterName;
    private String ait;
    private String namespace;
    private String lastUpdatedDate;
    private List<NameSpaceMetrices> nameSpaceMetrices;

}
