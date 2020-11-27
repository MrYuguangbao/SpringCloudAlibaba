package com.example.nacosclientorder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author admin
 * @date 2020/6/2 10:51
 */
@RestController
public class OrderCenterController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/getservice")
    public List<ServiceInstance> getServiceInstance(){
        List<ServiceInstance> instances = discoveryClient.getInstances("order-center");
        return instances;
    }

}
