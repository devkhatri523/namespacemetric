package com.example.springmongodb.service;

import com.example.springmongodb.model.*;
import com.example.springmongodb.util.Utility;
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
   // private static final NameSpaceRepo nameSpaceRepo

    public static void main(String... args) throws IOException, ParseException {
        String jsonData = "{\n" +
                "    \"data\":{\n" +
                "        \"cluster_name\":\"useast18\",\n" +
                "        \"namespace_metrices\":{\n" +
                "            \"cpu_utilization\":{\n" +
                "                \"changed\":false,\n" +
                "                \"connection\":\"close\",\n" +
                "\t\t\t\t\"date\":\"Thu,17 Aug 2023 15:59:57 GMT\",\n" +
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
                "                                    \"pod_ip\":\"54846\",\n" +
                "                                    \"uid\":\"12454\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.14\"\n" +
                "                                ]\n" +
                "                            },\n" +
                "\t\t\t\t\t\t\t{\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\",\n" +
                "                                     \"container\":\"cdefgh\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"node\":\"rrrrr\",\n" +
                "                                    \"phase\":\"running\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\",\n" +
                "                                    \"pod_ip\":\"54846\",\n" +
                "                                    \"uid\":\"12454\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.15\"\n" +
                "                                ]\n" +
                "                            },{\n" +
                "                                \"metric\":{\n" +
                "\t\t\t\t\t\t\t\t\t \"label_ait\":\"890\",\n" +
                "                                    \"namespace\":\"cp-0975621\",\n" +
                "                                     \"container\":\"cdefgh\",\n" +
                "                                    \"endpoint\":\"ffffff\",\n" +
                "                                    \"job\":\"ppppp\",\n" +
                "                                    \"node\":\"rrrrr\",\n" +
                "                                    \"phase\":\"running\",\n" +
                "                                    \"service\":\"afjkdn\",\n" +
                "                                    \"pod\":\"bbbbbbb\",\n" +
                "                                    \"pod_ip\":\"54846\",\n" +
                "                                    \"uid\":\"12454\"\n" +
                "                                },\n" +
                "                                \"value\":[\n" +
                "                                    1223435,\n" +
                "                                    \"0.16\"\n" +
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
        Date lastUpdateDate = Utility.parseDate(firstMetricResultData.getString("date"));
        Document firstJsonData = (Document) firstMetricResultData.get("json");
        Document firstResult = (Document) firstJsonData.get("data");
        List<Document> resultResultDoc = (List<Document>) firstResult.get("result");
        List<ContainerNamespace> containerNamespaceList = new ArrayList<>();
        List<PodMetrices> podMetricesList = new ArrayList<>();
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
                containerNamespace.setTimeStamp(lastUpdateDate);
            }
            containerNamespaceList.add(containerNamespace);

            //pod metrices
            Document secondMetricResultData = (Document) data.get("pod_info");
            List<Document> secondResult = (List<Document>) secondMetricResultData.get("result");
            PodMetrices podMetrices =  new PodMetrices();
            List<Result> results = new ArrayList<>();
            for (int k = 0; k < secondResult.size(); k++) {
                Document podmetric = (Document) secondResult.get(k).get("metric");
                String pod_label_ait =  podmetric.getString("label_ait");
                String pod_nameSpace = podmetric.getString("namespace");
                if (pod_label_ait == "" || pod_nameSpace == null || !pod_label_ait.equals(label_ait) || !pod_nameSpace.equals(nameSpace)) {
                    continue;
                }
                podMetrices.setAit(label_ait);
                podMetrices.setNamespace(nameSpace);
                podMetrices.setClusterName(clusterName);
                // Check if metric contains label_ait
                Metric metricdata = objectMapper.readValue(podmetric.toJson(), Metric.class);
                Result result = new Result();
                List<Object> valueData= (List<Object>) secondResult.get(k).get("value");
                result.setMetric(metricdata);
                result.setValue(valueData.get(1).toString());
                results.add(result);
            }
            podMetrices.setResult(results);
            podMetrices.setLastUpdatedDate((lastUpdateDate));
            podMetricesList.add(podMetrices);
        }
    }
    // podinfoMetricesRepo.save(podMetricsList)
    //  nameSpaceRepo.insert(containerNamespaceList);
}