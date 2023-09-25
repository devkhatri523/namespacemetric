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
        StringBuilder builderBuildString = new StringBuilder();
        builderBuildString.append(" { ");
        if (getContainer() != null) {
            builderBuildString.append("container=");
            builderBuildString.append(getContainer()+ ",");
        }  if (getEndpoint() != null) {
            builderBuildString.append("endpoint=");
            builderBuildString.append(getEndpoint()+",");
        }  if (getJob() != null) {
            builderBuildString.append("job=");
            builderBuildString.append(getJob()+",");
        }  if (getNamespace() != null) {
            builderBuildString.append("namespace=");
            builderBuildString.append(getNamespace()+",");
        }  if (getNode() != null) {
            builderBuildString.append("node=");
            builderBuildString.append(getNode()+",");
        }  if (getPhase() != null) {
            builderBuildString.append("phase=");
            builderBuildString.append(getPhase()+",");
        }  if (getService() != null) {
            builderBuildString.append("service=");
            builderBuildString.append(getService()+",");
        }  if (getPod() != null) {
            builderBuildString.append("pod=");
            builderBuildString.append(getPod()+",");
        }  if (getPod_ip() != null) {
            builderBuildString.append("pod_ip=");
            builderBuildString.append(getPod_ip()+",");
        }  if (getUid() != null) {
            builderBuildString.append("uid=");
            builderBuildString.append(getUid()+",");
        }  if (getLabel_ait() != null) {
            builderBuildString.append("label_it=");
            builderBuildString.append(getLabel_ait()+",");
        }  if (getResource() != null) {
            builderBuildString.append("resource=");
            builderBuildString.append(getResource()+",");
        }  if (getResource_quota() != null) {
            builderBuildString.append("resource_quota=");
            builderBuildString.append(getResource_quota()+",");
        }  if (getStatefulset() != null) {
            builderBuildString.append("statefulset=");
            builderBuildString.append(getStatefulset()+",");
        }  if (getInstance() != null) {
            builderBuildString.append("instance=");
            builderBuildString.append(getInstance()+",");
        }  if (getDeploymentconfig() != null) {
            builderBuildString.append("deploymentconfig=");
            builderBuildString.append(getDeploymentconfig()+",");
        }  if (getDeployment() != null) {
            builderBuildString.append("deployment=");
            builderBuildString.append(getDeployment());
        } else {
            builderBuildString.append("}");
        }

        return builderBuildString.toString();
    }

    private String deployment;
}
