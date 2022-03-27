package com.example.springelasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableElasticsearchRepositories("com.example.springelasticsearch.repo.elastic")
public class SpringElasticsearchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringElasticsearchApplication.class, args);
    }

}
