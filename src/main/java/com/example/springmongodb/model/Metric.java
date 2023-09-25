package com.example.springmongodb.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class Metric {
    private String container;
    private String endpoint;
    private String job;
    @JsonIgnore
    private String namespace;
    private String node;
    private String phase;
    private String service;
    private String pod;
    private String pod_ip;
    private String uid;
    @JsonIgnore
    private String label_ait;
    private String resource;
    private String resource_quota;
    private String statefulset;
    private String instance;
    private String deploymentconfig;

    @Override
    public String toString() {
        return "{" +
                "container='" + container + '\'' +
                ", endpoint='" + endpoint + '\'' +
                ", job='" + job + '\'' +
                ", namespace='" + namespace + '\'' +
                ", node='" + node + '\'' +
                ", phase='" + phase + '\'' +
                ", service='" + service + '\'' +
                ", pod='" + pod + '\'' +
                ", pod_ip='" + pod_ip + '\'' +
                ", uid='" + uid + '\'' +
                ", label_ait='" + label_ait + '\'' +
                ", resource='" + resource + '\'' +
                ", resource_quota='" + resource_quota + '\'' +
                ", statefulset='" + statefulset + '\'' +
                ", instance='" + instance + '\'' +
                ", deploymentconfig='" + deploymentconfig + '\'' +
                ", deployment='" + deployment + '\'' +
                '}';
    }

    private String deployment;
}
