package com.projects;

import com.projects.services.CordisService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.elasticsearch.ElasticsearchDataAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableAsync;

import java.io.IOException;


@EnableAsync
@EnableDiscoveryClient
@SpringBootApplication(exclude = ElasticsearchDataAutoConfiguration.class)
@EntityScan
public class Project {

    public static void main(String[] args) throws IOException {
       // CordisService.download();
       // CordisService.unzip();
        SpringApplication.run(Project.class, args);
    }

}