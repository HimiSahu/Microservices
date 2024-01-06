package com.webapp2.service;

import com.webapp2.entity.Employee;
import com.webapp2.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public List<Employee> getAllRegistrations() {
        List<Employee> reg = registrationRepository.findAll();
        return reg;
    }

}
