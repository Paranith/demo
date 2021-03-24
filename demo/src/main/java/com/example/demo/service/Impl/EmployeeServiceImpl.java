package com.example.demo.service.Impl;

import com.example.demo.exception.CustomErrorResponse;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;
import com.example.demo.service.EmployeeService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    ObjectMapper mapper = new ObjectMapper();

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Override
    public ResponseEntity addEmployee(Object employee) {
        try {
            Employee obj = mapper.convertValue(employee, Employee.class);
            employee = employeeRepo.save(obj);
            LOG.info("Adding new Employee is successful");
            return new ResponseEntity<Object>(employee, HttpStatus.OK);
        } catch (Exception e) {
            LOG.error("Error : " + e.getMessage());
            e.printStackTrace();
            CustomErrorResponse errors = new CustomErrorResponse();
            errors.setError("Unknown error");
            return new ResponseEntity<>(errors, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }


    @Override
    public ResponseEntity getAllEmployees(){
        try{
            List<Employee> employeeList = employeeRepo.findAll();
//            Company companyList = companyRepo.findByid(1);
            LOG.info("Getting all the Employees");
            return new ResponseEntity<Object>(employeeList,HttpStatus.OK);
        }catch (Exception e){
            LOG.error("Error : "+e.getMessage());
            e.printStackTrace();
            CustomErrorResponse errors = new CustomErrorResponse();
            errors.setError("Unknown error");
            return new ResponseEntity<>(errors, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @Override
    public ResponseEntity<Object> findEmployeeById(Integer id){
        try{
            Optional<Employee> EmployeeList = employeeRepo.findById(id);
            LOG.info("Getting Employee by Id");
            return new ResponseEntity<Object>(EmployeeList,HttpStatus.OK);
        }catch (Exception e){
            LOG.error("Error : "+e.getMessage());
            e.printStackTrace();
            CustomErrorResponse errors = new CustomErrorResponse();
            errors.setError("Unknown error");
            return new ResponseEntity<>(errors, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

    @Override
    public ResponseEntity<Object> deleteEmployeeById(Integer id){
        try{
            employeeRepo.deleteById(id);
            LOG.info("delete Employee by id");
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            LOG.error("Error : "+e.getMessage());
            e.printStackTrace();
            CustomErrorResponse errors = new CustomErrorResponse();
            errors.setError("Unknown error");
            return new ResponseEntity<>(errors, HttpStatus.SERVICE_UNAVAILABLE);
        }
    }

}
