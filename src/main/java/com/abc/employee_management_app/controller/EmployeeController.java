package com.abc.employee_management_app.controller;

import com.abc.employee_management_app.entity.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @PostMapping(path = "/create")
    public String createEmployee(@RequestBody Employee employee) {
        try {
            return "Employee added successfully.";
        } catch (Exception exception) {
            return exception.getMessage();
        }
    }
}
