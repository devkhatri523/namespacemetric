package com.example.springmongodb.controller;

import com.example.springmongodb.model.Metrices;
import com.example.springmongodb.model.NameSpaces;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;

public class ReadJson {

    public static void main(String[] args) {
        // MongoDB configuration
        String connectionString = "mongodb://localhost:27017"; // Replace with your MongoDB connection string
        String databaseName = "mydb";
        String collectionName = "namespace_metrices";

        // JSON data
        String jsonData ="{\n" +
                "    \"data\": {\n" +
                "        \"clustername\": \"useast018\",\n" +
                "        \"timestamp\": \"2023-08\",\n" +
                "        \"namespaceMetrics\": {\n" +
                "            \"cpu_utlization\": {\n" +
                "                \"json\": {\n" +
                "                    \"data\": {\n" +
                "                        \"result\": [\n" +
                "                            {\n" +
                "                                \"metric\": {\n" +
                "                                    \"label_ait\": \"45691\",\n" +
                "                                    \"namespace\": \"cp-4606059\"\n" +
                "                                },\n" +
                "                                \"value\": [\n" +
                "                                    1670,\n" +
                "                                    \"0.02\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"metric\": {\n" +
                "                                    \"namespace\": \"cp-damin\"\n" +
                "                                },\n" +
                "                                \"value\": [\n" +
                "                                    1690,\n" +
                "                                    \"0.06\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"memory_utilization\": {\n" +
                "                \"json\": {\n" +
                "                    \"data\": {\n" +
                "                        \"result\": [\n" +
                "                            {\n" +
                "                                \"metric\": {\n" +
                "                                    \"label_ait\": \"45691\",\n" +
                "                                    \"namespace\": \"cp-4606059\"\n" +
                "                                },\n" +
                "                                \"value\": [\n" +
                "                                    16922,\n" +
                "                                    \"2.38\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"metric\": {\n" +
                "                                    \"label_ait\": \"sandbox\",\n" +
                "                                    \"namespace\": \"cp-sandbox\"\n" +
                "                                },\n" +
                "                                \"value\": [\n" +
                "                                    16922,\n" +
                "                                    \"2.38\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "                        ]\n" +
                "                    }\n" +
                "                }\n" +
                "            },\n" +
                "            \"pod_info\": {\n" +
                "                \"result\": [\n" +
                "                    {\n" +
                "                        \"metric\": {\n" +
                "                            \"namespace\": \"cp-0975620\",\n" +
                "                            \"node\": \"lltwa04\",\n" +
                "                            \"phase\": \"running\",\n" +
                "                            \"pod\":\"abc\",\n" +
                "                            \"label_ait\": \"12345\",\n" +
                "                            \"pod_ip\":\"10.102\",\n" +
                "                            \"uid\":\"dsaifnshg\"\n" +
                "                        },\n" +
                "                        \"value\": [\n" +
                "                            1675,\n" +
                "                            \"1\"\n" +
                "                        ]\n" +
                "                    },\n" +
                "                    {\n" +
                "                        \"metric\": {\n" +
                "                            \"label_ait\": \"45691\",\n" +
                "                            \"namespace\": \"cp-4606059\",\n" +
                "                            \"node\": \"lltwa04abc\",\n" +
                "                            \"phase\": \"running\",\n" +
                "                            \"pod_ip\":\"10.102\",\n" +
                "                            \"uid\":\"dsaifnshg\",\n" +
                "                            \"pod\":\"cde\",\n" +
                "                        },\n" +
                "                        \"value\": [\n" +
                "                            1645,\n" +
                "                            \"1\"\n" +
                "                        ]\n" +
                "                    }\n" +
                "                ]\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "}";

        // Parse JSON and store metrics in MongoDB
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            // Connect to MongoDB
            MongoClient mongoClient = MongoClients.create(connectionString);
            MongoDatabase database = mongoClient.getDatabase(databaseName);
            MongoCollection<Document> collection = database.getCollection(collectionName);

            // Parse JSON data
            Document jsonDataDocument = Document.parse(jsonData);
            Document namespaceMetricesData = (Document) jsonDataDocument.get("data");
            Document nameSpacesMetrices =  (Document) namespaceMetricesData.get("namespaceMetrics");


            // Iterate through metrics and insert them into MongoDB
            for (String nameSpaceMetricName : nameSpacesMetrices.keySet()) {
                Document metricData = (Document) nameSpacesMetrices.get(nameSpaceMetricName);

                Document jsonDataResult = (Document) metricData.get("json");
                List<Document> resultDocuments ;
                Document data ;
                if(jsonDataResult==null){
                    resultDocuments =(List<Document>) metricData.get("result");
                }else{
                    data = (Document)  jsonDataResult.get("data");
                    resultDocuments = (List<Document>) data.get("result");
                }

                for (Document resultDocument : resultDocuments) {
                  Document metric = (Document) resultDocument.get("metric");
                    if (metricData.get("label_ait") == "") {
                        continue;
                    }
                    List<Object> metricValue = (List<Object>) resultDocument.get("value");
                    NameSpaces  nameSpaces = new NameSpaces();
                    Metrices metrices = objectMapper.readValue(metric.toJson(), Metrices.class);

                    nameSpaces.setNameSpace(nameSpaceMetricName);
                    nameSpaces.setMetrices(metrices);
                    nameSpaces.setValue((String) metricValue.get(1));
                    // Insert the NamespaceMetric object into MongoDB
                    collection.insertOne(Document.parse(objectMapper.writeValueAsString(nameSpaces)));
                }
            }

            // Close MongoDB connection
            mongoClient.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}
