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
       String jsonData = exchange.getIn().getBody(String.class);

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
                Document data  = (Document)  jsonDataResult.get("data");
                List<Document> resultDocuments = (List<Document>) data.get("result");

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
