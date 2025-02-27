package com.spring.employeepayrollapp.services;
import com.spring.employeepayrollapp.dto.EmployeePayrollDTO;
import com.spring.employeepayrollapp.model.EmployeePayrollData;
//import com.spring.employeepayrollapp.model.EmployeePayrollData;

import java.util.List;
public interface IEmployeePayrollService {
    List<EmployeePayrollData> getEmployeePayrollData();

    EmployeePayrollData getEmployeePayrollDataById(int empId);

    EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO employeePayrollDTO);

    EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO);

    void deleteEmployeePayrollData(int empId);


}