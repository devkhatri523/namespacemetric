package com.example.springmongodb.promethesus;

import com.example.springmongodb.repository.NameSpaceRepo;
import com.example.springmongodb.repository.PodInfoMetricesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Promethesus {
    private final NameSpaceRepo nameSpaceRepo;
    private final PodInfoMetricesRepo podInfoMetricesRepo;



    @Autowired
    public Promethesus(NameSpaceRepo nameSpaceRepo, PodInfoMetricesRepo podInfoMetricesRepo) {
        this.nameSpaceRepo = nameSpaceRepo;
        this.podInfoMetricesRepo = podInfoMetricesRepo;
    }
}
