package com.example.springmongodb;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class SpringMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoDbApplication.class, args);
    }

}
