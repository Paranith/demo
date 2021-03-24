package com.example.demo.service;

import org.springframework.http.ResponseEntity;

public interface EmployeeService {
    public ResponseEntity addEmployee(Object Employee);

    public ResponseEntity getAllEmployees();

    public ResponseEntity<Object> findEmployeeById(Integer id);

    public ResponseEntity deleteEmployeeById(Integer id);

}
