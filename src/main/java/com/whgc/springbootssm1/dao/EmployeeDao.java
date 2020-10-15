package com.whgc.springbootssm1.dao;

import com.whgc.springbootssm1.bean.Employee;

import java.util.List;

public interface EmployeeDao {
    public void addEmp(Employee employee);
    public void delEmp(Integer[] id);
    public void updateEmp(Employee employee);
    public List<Employee> listAllEmp();
    public Employee findOneEmp(Integer id);
}
