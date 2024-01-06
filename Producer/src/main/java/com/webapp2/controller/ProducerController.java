package com.webapp2.controller;

import com.webapp2.entity.Employee;
import com.webapp2.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProducerController {

    private final ProducerService producerService;
    @Autowired
    public ProducerController(ProducerService producerService){
        this.producerService = producerService;
    }

    @GetMapping("/data")
    public String getData(){
       return "hello from Producer";
    }


    @GetMapping("/employee")
    public List<Employee> getEmployee() {
        List<Employee> allRegistrations = producerService.getAllRegistrations();
        return allRegistrations;

    }

}

