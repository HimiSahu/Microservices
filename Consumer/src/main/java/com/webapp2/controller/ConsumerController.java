package com.webapp2.controller;

import com.webapp2.entity.Employee;
import com.webapp2.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/consumer")
public class ConsumerController {

    private final ConsumerService consumerService;

  @Autowired
  public ConsumerController(ConsumerService consumerService) {
   this.consumerService = consumerService;
    }

    @GetMapping("/fetch")
    public String fetchData(){
        String data = consumerService.fetchDataFromProducer();
        return data;
    }


    @GetMapping("/employee")
    public Employee fetchEmployee() {
        return consumerService.fetchEmployeeFromProducer();
    }




}
