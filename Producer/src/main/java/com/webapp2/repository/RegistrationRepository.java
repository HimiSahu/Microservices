package com.webapp2.repository;

import com.webapp2.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Employee, Long> {
}
