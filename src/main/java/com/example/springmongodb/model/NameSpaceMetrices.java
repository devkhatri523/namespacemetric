package com.example.springmongodb.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
public class NameSpaceMetrices {
    private String namesSpaceName ;
    private List<String> result;

}
