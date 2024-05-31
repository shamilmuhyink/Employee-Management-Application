package com.abc.employee_management_app.service.implementation;

import com.abc.employee_management_app.entity.Employee;
import com.abc.employee_management_app.service.EmployeeService;

public class EmployeeServiceimpl implements EmployeeService {

    @Override
    public Employee createEmployee(Employee employee) {
        Employee emp = new Employee();
        try {

        } catch (Exception exception) {
            System.out.println(exception.getStackTrace());
        }
        return emp;
    }
}
