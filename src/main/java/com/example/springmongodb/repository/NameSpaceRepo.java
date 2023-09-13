package com.example.springmongodb.repository;

import com.example.springmongodb.model.ContainerNamespace;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NameSpaceRepo extends MongoRepository<ContainerNamespace,String> {
}
