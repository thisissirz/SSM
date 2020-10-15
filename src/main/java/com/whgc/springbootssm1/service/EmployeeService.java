package com.whgc.springbootssm1.service;

import com.whgc.springbootssm1.bean.Employee;

import java.util.List;

public interface EmployeeService {

    public Employee findOne(Integer id);

    public List<Employee> listAllEmp();

    public void addEmp(Employee employee);

    public void delEmp(Integer[] id);

    public void updateEmp(Employee employee);
}
