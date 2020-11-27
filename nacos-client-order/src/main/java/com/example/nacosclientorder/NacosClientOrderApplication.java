package com.example.nacosclientorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosClientOrderApplication.class, args);
    }

}
