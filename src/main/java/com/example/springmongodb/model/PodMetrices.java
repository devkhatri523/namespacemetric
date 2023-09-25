package com.example.springmongodb.model;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@Document("pod_info")
public class PodMetrices {
    private String clusterName;
    @Id
    private String ait;
    private String namespace;
    private Date lastUpdatedDate;
    private List<String> result;
    @DBRef
    private ContainerNamespace containerNamespace;
}
