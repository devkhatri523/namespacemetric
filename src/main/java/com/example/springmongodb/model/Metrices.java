package com.example.springmongodb.model;

import lombok.Data;

@Data
public class Metrices {
    private String namespace;
    private String label_ait;
    private String phase;
    private String node;
    private String pod;
    private String pod_ip;
    private String uid;
}
