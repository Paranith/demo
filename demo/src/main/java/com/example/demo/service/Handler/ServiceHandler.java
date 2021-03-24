package com.example.demo.service.Handler;

import com.example.demo.service.EmployeeService;
import com.example.demo.util.CommonConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ServiceHandler {

    @Autowired
    EmployeeService employeeService;

    public ResponseEntity handleServiceRequest(String reqId, Object obj, Integer id) {
        switch (Integer.parseInt(reqId)) {

            case CommonConstants.ADD_EMPLOYEE:
                return addEmployee(obj);
            case CommonConstants.GET_ALL_EMPLOYEES:
                return getAllEmployees();
            case CommonConstants.GET_EMPLOYEE_BY_ID:
                return getEmployeeById(id);
            case CommonConstants.DELETE_EMPLOYEE_BY_ID:
                return deleteEmployeebyId(id);


            default:
                return new ResponseEntity("Failed", HttpStatus.OK);

        }
    }

    //Employees
    private ResponseEntity addEmployee(Object employee) {return employeeService.addEmployee(employee);}

    private ResponseEntity getAllEmployees() {return employeeService.getAllEmployees();}

    private ResponseEntity getEmployeeById(Integer id) {return employeeService.findEmployeeById(id);}

    private ResponseEntity deleteEmployeebyId(Integer id) {return employeeService.deleteEmployeeById(id);}

}
