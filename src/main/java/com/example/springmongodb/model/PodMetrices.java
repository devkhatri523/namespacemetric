package com.example.springmongodb.model;


import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@Document("pod_info")
public class PodMetrices {
    private String clusterName;
    private Date lastUpdatedDate;
    private Map<String,String> podInfoData;
}
