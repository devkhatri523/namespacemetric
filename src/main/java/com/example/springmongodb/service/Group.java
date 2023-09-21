package com.example.springmongodb.service;

import com.example.springmongodb.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bson.Document;
import java.io.IOException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class Group {
   // private static final NameSpaceRepo nameSpaceRepo;



    public static void main(String... args) throws IOException, ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM", Locale.ENGLISH);
        String jsonData = "{\n" +
                "    \"data\":{\n" +
                "        \"cluster_name\":\"useast18\",\n" +
                "        \"namespace_metrices\":{\n" +
                "            \"cpu_utilization\":{\n" +
                "                \"changed\":false,\n" +
                "                \"connection\":\"close\",\n" +
                "\t\t\t\t\"date\":\"12 sep\",\n" +
                "                \"json\":{\n" +
                "                    \"data\":{\n" +
                "                        \"result\":[\n" +
                "                            {\n" +
                "                                \"metric\":{\n" +
                "                                    \"namespace\":\"cp-0975620\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                             {\n" +
                "                                \"metric\":{\n" +
                "                                    \"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "\t\t\t\t\t\t\t {\n" +
                "                                \"metric\":{\n" +
                "                                    \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "\n" +
                "                        ]\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "            },\n" +
                "            \"memory_utilization\":{\n" +
                "                \"changed\":false,\n" +
                "                \"connection\":\"close\",\n" +
                "                \"json\":{\n" +
                "                    \"data\":{\n" +
                "                        \"result\":[\n" +
                "                            {\n" +
                "                                \"metric\":{\n" +
                "                                    \"namespace\":\"cp-0975620\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                             {\n" +
                "                                \"metric\":{\n" +
                "                                    \"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "\t\t\t\t\t\t\t{\n" +
                "                                \"metric\":{\n" +
                "                                    \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "\n" +
                "                        ]\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "            },\n" +
                "            \"percentage_pods_available_per_deployment\":{\n" +
                "                \"changed\":false,\n" +
                "                \"connection\":\"close\",\n" +
                "                \"json\":{\n" +
                "                    \"data\":{\n" +
                "                        \"result\":[\n" +
                "                            {\n" +
                "                                \"metric\":{ \n" +
                "\t\t\t\t\t\t\t\t   \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\",\n" +
                "                                    \"container\":\"cdefgh\",\n" +
                "                                    \"deployment\":\"kkkkkk\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"namespace\":\"cp-build\",\n" +
                "                                    \"service\":\"afjkdn\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                               {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t \"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\",\n" +
                "                                    \"container\":\"oooo\",\n" +
                "                                    \"deployment\":\"mmmmm\",\n" +
                "                                    \"endpoint\":\"nnnnn\",\n" +
                "                                    \"job\":\"ggggg\",\n" +
                "                                    \"namespace\":\"cp-build\",\n" +
                "                                    \"service\":\"afjkdn\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "\n" +
                "                        ]\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "            },\n" +
                "            \"percentage_pods_available_per_deploymentconfig\":{\n" +
                "                \"changed\":false,\n" +
                "                \"connection\":\"close\",\n" +
                "                \"json\":{\n" +
                "                    \"data\":{\n" +
                "                        \"result\":[\n" +
                "                            {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\",\n" +
                "                                    \"container\":\"cdefgh\",\n" +
                "                                    \"deploymentconfig\":\"kkkkkk\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"label_ait\":\"yyyyyy\",\n" +
                "                                    \"instance\":\"iiiiii\",\n" +
                "                                    \"namespace\":\"cp-build\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                               {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t\"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\",\n" +
                "                                    \"container\":\"cdefgh\",\n" +
                "                                    \"deploymentconfig\":\"kkkkkk\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"label_ait\":\"yyyyyy\",\n" +
                "                                    \"instance\":\"iiiiii\",\n" +
                "                                    \"namespace\":\"cp-build\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "\n" +
                "                        ]\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "            },\n" +
                "            \"percentage_pods_available_per_statefulset\":{\n" +
                "                \"changed\":false,\n" +
                "                \"connection\":\"close\",\n" +
                "                \"json\":{\n" +
                "                    \"data\":{\n" +
                "                        \"result\":[\n" +
                "                            {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\",\n" +
                "                                    \"container\":\"cdefgh\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"namespace\":\"cp-build\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\",\n" +
                "                                    \"statefulset\":\"vvvvvv\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                               {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t\"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\",\n" +
                "                                    \"container\":\"cdefgh\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"namespace\":\"cp-build\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\",\n" +
                "                                    \"statefulset\":\"vvvvvv\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "\n" +
                "                        ]\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "            },\n" +
                "            \"resource_quota\":{\n" +
                "                \"changed\":false,\n" +
                "                \"connection\":\"close\",\n" +
                "                \"json\":{\n" +
                "                    \"data\":{\n" +
                "                        \"result\":[\n" +
                "                            {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\",\n" +
                "                                    \"container\":\"cdefgh\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\",\n" +
                "                                    \"resource\":\"oooooo\",\n" +
                "                                    \"resource_quota\":\"qqqqq\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                              {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t\"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\",\n" +
                "                                    \"container\":\"cdefgh\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\",\n" +
                "                                    \"resource\":\"oooooo\",\n" +
                "                                    \"resource_quota\":\"qqqqq\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "\n" +
                "                        ]\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "            },\"total_running_pods\":{\n" +
                "                \"changed\":false,\n" +
                "                \"connection\":\"close\",\n" +
                "                \"json\":{\n" +
                "                    \"data\":{\n" +
                "                        \"result\":[\n" +
                "                            {\n" +
                "                                \"metric\":{\n" +
                "                                    \"namespace\":\"cp-0975620\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                             {\n" +
                "                                \"metric\":{\n" +
                "                                    \"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "\t\t\t\t\t\t\t{\n" +
                "                                \"metric\":{\n" +
                "                                    \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "\n" +
                "                        ]\n" +
                "                    }\n" +
                "\n" +
                "                }\n" +
                "            }\n" +
                "\n" +
                "\n" +
                "\n" +
                "        },\n" +
                "        \"pod_info\":{\n" +
                "            \"result\":[\n" +
                "                {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t \"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\",\n" +
                "                                    \"container\":\"cdefgh\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "\t\t\t\t\t\t\t\t\t\"node\":\"rrrrr\",\n" +
                "                                    \"phase\":\"running\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\",\n" +
                "                                    \"pod_ip\":\"54844\",\n" +
                "                                    \"uid\":\"12454\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "                            {\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t \"label_ait\":\"45671\",\n" +
                "                                    \"namespace\":\"cp-0975620\",\n" +
                "                                     \"container\":\"cdefgh\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"node\":\"rrrrr\",\n" +
                "                                    \"phase\":\"running\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\",\n" +
                "                                    \"pod_ip\":\"54844\",\n" +
                "                                    \"uid\":\"12454\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.1234\"\n" +
                "                                ]\n" +
                "                            }\n" +
                "\n" +
                "\n" +
                "            ]\n" +
                "        }\n" +
                "    }\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        Document jsonDataDocument = Document.parse(jsonData);
        Document data = (Document) jsonDataDocument.get("data");
        String clusterName = (String) data.get("cluster_name");
        Document nameSpacesMetricesData = (Document) data.get("namespace_metrices");
        Document firstMetricResultData = (Document) nameSpacesMetricesData.get("cpu_utilization");
        Date lastUpdateDate = simpleDateFormat.parse(firstMetricResultData.getString("date"));
        Document firstJsonData = (Document) firstMetricResultData.get("json");
        Document firstResult = (Document) firstJsonData.get("data");
        List<Document> resultResultDoc = (List<Document>) firstResult.get("result");
        List<ContainerNamespace> containerNamespaceList = new ArrayList<>();
        for (int i = 0; i < resultResultDoc.size(); i++) {
            Document metric = (Document) resultResultDoc.get(i).get("metric");
            String label_ait =  metric.getString("label_ait");
            String nameSpace = metric.getString("namespace");
            if (label_ait == "" || label_ait == null) {
                continue;
            }
            ContainerNamespace containerNamespace = new ContainerNamespace();
            containerNamespace.setClusterName(clusterName);
            containerNamespace.setAit(label_ait);
            containerNamespace.setNamespace(nameSpace);
            List<NameSpaceMetrices> nameSpaceMetricesList = new ArrayList<>();
            for (String metricName : nameSpacesMetricesData.keySet()) {
                Document nameSpaceData = (Document) nameSpacesMetricesData.get(metricName);
                Document nameSpaceJson = (Document) nameSpaceData.get("json");
                Document nameSpaceJsonData = (Document) nameSpaceJson.get("data");
                List<Document> resultList = (List<Document>) nameSpaceJsonData.get("result");
                NameSpaceMetrices nameSpaceMetrices = new NameSpaceMetrices();
                nameSpaceMetrices.setNamesSpaceName(metricName);
                List<Result> results = new ArrayList<>();
                for (int j = 0; j < resultList.size(); j++) {
                    Result result = new Result();
                    Document metricInfo = (Document) resultList.get(j).get("metric");
                    String labelAit = metricInfo.getString("label_ait");
                    String namespace = metricInfo.getString("namespace");
                    // Check if metric contains label_ait
                    if (labelAit == "" || labelAit == null || !labelAit.equals(label_ait) || !namespace.equals(nameSpace)) {
                        continue;
                    }
                    List<Object> valueDoc = (List<Object>) resultList.get(j).get("value");
                    String value = valueDoc.get(1).toString();
                    Metric metricdata = objectMapper.readValue(metricInfo.toJson(), Metric.class);
                    result.setMetric(metricdata);
                    result.setValue(value);
                    results.add(result);
                }
                nameSpaceMetrices.setResult(results);
                nameSpaceMetricesList.add(nameSpaceMetrices);
                containerNamespace.setNameSpaceMetrices(nameSpaceMetricesList);
            }
            containerNamespaceList.add(containerNamespace);
        }
      //  nameSpaceRepo.insert(containerNamespaceList);

// for pod info

        Document secondMetricResultData = (Document) data.get("pod_info");
        List<Document> secondResult = (List<Document>) secondMetricResultData.get("result");
        List<PodMetrices> podMetricesList = new ArrayList<>();
        for (int i = 0; i < secondResult.size(); i++) {
            Document metric = (Document) secondResult.get(i).get("metric");
            String label_ait =  metric.getString("label_ait");
            String nameSpace = metric.getString("namespace");
            if (label_ait == "" || label_ait == null) {
                continue;
            }
            List<Result> results = new ArrayList<>();
            PodMetrices podMetrices = new PodMetrices();
            podMetrices.setAit(label_ait);
            podMetrices.setNamespace(nameSpace);
            podMetrices.setClusterName(clusterName);
            for (int j = 0; j < secondResult.size(); j++) {
                Document resultList = secondResult.get(j);
                Document metricInfo = (Document) resultList.get("metric");
                String labelAit = metricInfo.getString("label_ait");
                String namespace = metricInfo.getString("namespace");
                // Check if metric contains label_ait
                if (labelAit == "" || labelAit == null || !labelAit.equals(label_ait)|| !namespace.equals(nameSpace)){
                    continue;
                }
                Metric metricdata = objectMapper.readValue(metricInfo.toJson(), Metric.class);
                Result result = new Result();
                List<Object> valueData= (List<Object>) resultList.get("value");
                result.setMetric(metricdata);
                result.setValue(valueData.get(1).toString());
                results.add(result);
                podMetrices.setResult(results);
                podMetrices.setLastUpdatedDate(simpleDateFormat.parse(String.valueOf((lastUpdateDate))));
            }
            podMetricesList.add(podMetrices);
        }

        // podinfoMetricesRepo.save(podMetricsList)
    }
}