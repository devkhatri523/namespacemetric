package com.example.springmongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document("cont_namespace_info")
public class ContainerNamespace {
    private String clusterName;
    @Id
    private String ait;
    private String namespace;
    private Date timeStamp;
    private List<NameSpaceMetrices> nameSpaceMetrices;

}
