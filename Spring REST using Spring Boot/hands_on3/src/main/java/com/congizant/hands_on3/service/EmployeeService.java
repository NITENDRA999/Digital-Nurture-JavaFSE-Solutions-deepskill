package com.congizant.hands_on3.service;

import com.congizant.hands_on3.dao.EmployeeDao;
import com.congizant.hands_on3.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public EmployeeService(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public List<Employee> getAllEmployees()
    {
        return employeeDao.getAllEmployee();
    }
}
