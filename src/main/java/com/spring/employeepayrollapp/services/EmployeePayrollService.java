package com.spring.employeepayrollapp.services;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

import com.spring.employeepayrollapp.dto.EmployeePayrollDTO;
import com.spring.employeepayrollapp.model.EmployeePayrollData;
import org.springframework.stereotype.Service;


@Service
public class EmployeePayrollService implements IEmployeePayrollService{

    private List<EmployeePayrollData> employeePayrollList = new ArrayList<>();

    public List<EmployeePayrollData> getEmployeePayrollData(){
      return employeePayrollList;
    }

    public EmployeePayrollData getEmployeePayrollDataById(int empId) {
        return employeePayrollList.get(empId-1);
    }

    @Override
    public EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = null;
        empData = new EmployeePayrollData(employeePayrollList.size()+1, empPayrollDTO);
        employeePayrollList.add(empData);
        return empData;
    }


    public EmployeePayrollData updateEmployeePayrollData(int empId ,EmployeePayrollDTO empPayrollDTO) {
        EmployeePayrollData empData = this.getEmployeePayrollDataById(empId);
        empData.setName(empPayrollDTO.name);
        empData.setSalary(empPayrollDTO.salary);
        employeePayrollList.set(empId-1 , empData);
        return empData;

    }

    public void deleteEmployeePayrollData(int empId) {
         employeePayrollList.remove(empId-1);
    }
}
