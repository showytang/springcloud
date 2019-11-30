package com.ytang.controller;

import com.ytang.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/clazz")
public class ClazzController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    DiscoveryClient client;

    @GetMapping
    public Student find(){
        String url = "http://%s:%d/student";
        List<ServiceInstance> instances = client.getInstances("student-service");
        String host = instances.get(0).getHost();
        int port = instances.get(0).getPort();
        url = String.format(url,host,port);
        Student students = restTemplate.getForObject("http://student-service/student/1007",Student.class);
        return students;
    }
}
