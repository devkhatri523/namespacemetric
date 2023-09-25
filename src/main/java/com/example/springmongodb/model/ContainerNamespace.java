package com.example.springmongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Document("cont_namespace_info")
public class ContainerNamespace {
    private String clusterName;
    @Id
    private String ait;
    private String namespace;
    private Date timeStamp;
    private Map<String,String> nameSpaceMetricData;
}
