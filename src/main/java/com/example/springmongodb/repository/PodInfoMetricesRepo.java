package com.example.springmongodb.repository;

import com.example.springmongodb.model.PodMetrices;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PodInfoMetricesRepo extends MongoRepository<PodMetrices,String> {
}
