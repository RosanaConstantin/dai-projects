package com.projects;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;


@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication(exclude = ElasticsearchDataAutoConfiguration.class)
@EntityScan
public class Project {

    public static void main(String[] args) {
        SpringApplication.run(Project.class, args);
    }

}