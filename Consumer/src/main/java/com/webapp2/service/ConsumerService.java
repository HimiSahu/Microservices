package com.webapp2.service;

import com.webapp2.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerService {
    private final RestTemplate restTemplate;

    @Autowired
    public ConsumerService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String fetchDataFromProducer() {
        String producerUrl ="http://localhost:8080/api/data";
        return restTemplate.getForObject(producerUrl, String.class);
    }



    public Employee fetchEmployeeFromProducer() {
        String producerUrl = "http://localhost:8080/api/employee";
        return restTemplate.getForObject(producerUrl, Employee.class);
    }

}
