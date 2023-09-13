package com.example.springmongodb.controller;

import com.example.springmongodb.model.ContainerNamespace;
import com.example.springmongodb.model.Metric;
import com.example.springmongodb.model.NameSpaceMetrices;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.List;

public class ReadJson {

    public static void main(String[] args) {
        String connectionString = "mongodb://localhost:27017"; // Replace with your MongoDB connection string
        String databaseName = "mydb";
        String collectionName = "namespace_metrices";

        String jsonData = "{\"data\":{\"cluster_name\":\"useast18\",\"namespace_metrices\":{\"cpu_utilization\":{\"changed\":false,\"connection\":\"close\",\"date\":\"12sep\",\"json\":{\"data\":{\"result\":[{\"metric\":{\"namespace\":\"cp-0975620\"},\"value\":[1223435,\"0.1234\"]},{\"metric\":{\"label_ait\":\"45671\",\"namespace\":\"cp-0975620\"},\"value\":[1223435,\"0.1234\"]}]}}},\"memory_utilization\":{\"changed\":false,\"connection\":\"close\",\"json\":{\"data\":{\"result\":[{\"metric\":{\"namespace\":\"cp-0975620\"},\"value\":[1223435,\"0.1234\"]},{\"metric\":{\"label_ait\":\"45671\",\"namespace\":\"cp-0975620\"},\"value\":[1223435,\"0.1234\"]}]}}},\"percentage_pods_available_per_deployment\":{\"changed\":false,\"connection\":\"close\",\"json\":{\"data\":{\"result\":[{\"metric\":{\"container\":\"cdefgh\",\"deployment\":\"kkkkkk\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"namespace\":\"cp-build\",\"service\":\"afjkdn\"},\"value\":[1223435,\"0.1234\"]},{\"metric\":{\"container\":\"oooo\",\"deployment\":\"mmmmm\",\"endpoint\":\"nnnnn\",\"job\":\"ggggg\",\"namespace\":\"cp-build\",\"service\":\"afjkdn\"},\"value\":[1223435,\"0.1234\"]}]}}},\"percentage_pods_available_per_deploymentconfig\":{\"changed\":false,\"connection\":\"close\",\"json\":{\"data\":{\"result\":[{\"metric\":{\"container\":\"cdefgh\",\"deploymentconfig\":\"kkkkkk\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"label_ait\":\"yyyyyy\",\"instance\":\"iiiiii\",\"namespace\":\"cp-build\",\"service\":\"afjkdn\",\"pod\":\"bbbbbbb\"},\"value\":[1223435,\"0.1234\"]},{\"metric\":{\"container\":\"cdefgh\",\"deploymentconfig\":\"kkkkkk\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"label_ait\":\"yyyyyy\",\"instance\":\"iiiiii\",\"namespace\":\"cp-build\",\"service\":\"afjkdn\",\"pod\":\"bbbbbbb\"},\"value\":[1223435,\"0.1234\"]}]}}},\"percentage_pods_available_per_statefulset\":{\"changed\":false,\"connection\":\"close\",\"json\":{\"data\":{\"result\":[{\"metric\":{\"container\":\"cdefgh\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"namespace\":\"cp-build\",\"service\":\"afjkdn\",\"pod\":\"bbbbbbb\",\"statefulset\":\"vvvvvv\"},\"value\":[1223435,\"0.1234\"]},{\"metric\":{\"container\":\"cdefgh\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"namespace\":\"cp-build\",\"service\":\"afjkdn\",\"pod\":\"bbbbbbb\",\"statefulset\":\"vvvvvv\"},\"value\":[1223435,\"0.1234\"]}]}}},\"resource_quota\":{\"changed\":false,\"connection\":\"close\",\"json\":{\"data\":{\"result\":[{\"metric\":{\"container\":\"cdefgh\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"label_ait\":\"72967\",\"namespace\":\"cp-build\",\"service\":\"afjkdn\",\"pod\":\"bbbbbbb\",\"resource\":\"oooooo\",\"resource_quota\":\"qqqqq\"},\"value\":[1223435,\"0.1234\"]},{\"metric\":{\"container\":\"cdefgh\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"label_ait\":\"72967\",\"namespace\":\"cp-build\",\"service\":\"afjkdn\",\"pod\":\"bbbbbbb\",\"resource\":\"oooooo\",\"resource_quota\":\"qqqqq\"},\"value\":[1223435,\"0.1234\"]}]}}},\"total_running_pods\":{\"changed\":false,\"connection\":\"close\",\"json\":{\"data\":{\"result\":[{\"metric\":{\"namespace\":\"cp-0975620\"},\"value\":[1223435,\"0.1234\"]},{\"metric\":{\"label_ait\":\"45671\",\"namespace\":\"cp-0975620\"},\"value\":[1223435,\"0.1234\"]}]}}}},\"pod_info\":{\"result\":[{\"metric\":{\"container\":\"cdefgh\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"namespace\":\"cp-build\",\"node\":\"rrrrr\",\"phase\":\"running\",\"service\":\"afjkdn\",\"pod\":\"bbbbbbb\",\"pod_ip\":\"54844\",\"uid\":\"12454\"},\"value\":[1223435,\"0.1234\"]},{\"metric\":{\"container\":\"cdefgh\",\"endpoint\":\"ffffff\",\"job\":\"ppppp\",\"namespace\":\"cp-build\",\"node\":\"rrrrr\",\"phase\":\"running\",\"service\":\"afjkdn\",\"pod\":\"bbbbbbb\",\"pod_ip\":\"54844\",\"uid\":\"12454\"},\"value\":[1223435,\"0.1234\"]}]}}}";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Connect to MongoDB
            MongoClient mongoClient = MongoClients.create(connectionString);
            MongoDatabase database = mongoClient.getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);
            // Parse JSON data
            Document jsonDataDocument = Document.parse(jsonData);
            Document namespaceMetricesData = (Document) jsonDataDocument.get("data");
            Document nameSpacesMetrices = (Document) namespaceMetricesData.get("namespace_metrices");
            Document cpu_utilization = (Document) ((Document) namespaceMetricesData.get("namespace_metrices")).get("cpu_utilization");
            String lastUpdateDate =  cpu_utilization.get("date").toString();
            String clusterName =  namespaceMetricesData.get("cluster_name").toString();
            List<NameSpaceMetrices> nameSpaceMetricesList = new ArrayList<>();
            ContainerNamespace containerNamespace = new ContainerNamespace();
            containerNamespace.setClusterName(clusterName);
            containerNamespace.setLastUpdatedDate(lastUpdateDate);

            // Iterate through metrics and insert them into MongoDB
            for (String nameSpaceMetricName : nameSpacesMetrices.keySet()) {
                Document metricData = (Document) nameSpacesMetrices.get(nameSpaceMetricName);
                Document jsonDataResult = (Document) metricData.get("json");
                List<Document> resultDocuments;
                Document data;
                if (jsonDataResult == null) {
                    resultDocuments = (List<Document>) metricData.get("result");
                } else {
                    data = (Document) jsonDataResult.get("data");
                    resultDocuments = (List<Document>) data.get("result");
                }
                List<Metric> metricList = new ArrayList<>();
                NameSpaceMetrices nameSpaces = new NameSpaceMetrices();
                nameSpaces.setNamesSpaceName(nameSpaceMetricName);
                for (Document resultDocument : resultDocuments) {
                    Document metric = (Document) resultDocument.get("metric");
                    List<Object> metricValue = (List<Object>) resultDocument.get("value");
                    Metric metrices = objectMapper.readValue(metric.toJson(), Metric.class);
                    metricList.add(metrices);
                    nameSpaces.setValue((String) metricValue.get(1));
                }
                nameSpaces.setMetric(metricList);
                nameSpaceMetricesList.add(nameSpaces);
                containerNamespace.setNameSpaceMetrices(nameSpaceMetricesList);
            }
           // Document
            Document containerMetricesData = new Document("cont_namespace_info", containerNamespace);
            collection.insertOne(Document.parse(objectMapper.writeValueAsString(containerMetricesData)));

            // parse pod info

            Document podInfoMetrices = (Document) namespaceMetricesData.get("pod_info");
            List<Document> podInfoResult  = (List<Document>) podInfoMetrices.get("result");
            List<Metric> metricList = new ArrayList<>();
            NameSpaceMetrices nameSpaces = new NameSpaceMetrices();
            for (Document podInfoResultDocument : podInfoResult) {
                Document metric = (Document) podInfoResultDocument.get("metric");
                List<Object> metricValue = (List<Object>) podInfoResultDocument.get("value");
                Metric metrices = objectMapper.readValue(metric.toJson(), Metric.class);
                metricList.add(metrices);
                nameSpaces.setValue((String) metricValue.get(1));
            }
            nameSpaces.setNamesSpaceName("pod_info");
            nameSpaces.setMetric(metricList);
            Document podInfoMetrics = new Document("pod_info_metrices", nameSpaces);
            collection.insertOne(Document.parse(objectMapper.writeValueAsString(podInfoMetrics)));

            // Close MongoDB connection
            mongoClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}






