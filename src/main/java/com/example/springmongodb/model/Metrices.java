package com.example.springmongodb.model;

import lombok.Data;

@Data
public class Metrices {
    private String namespace;
    private String label_ait;
    private String phase;
    private String pod;
    private String pod_id;
    private String uid;
}
