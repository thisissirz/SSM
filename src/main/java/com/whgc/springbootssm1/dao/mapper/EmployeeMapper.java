package com.whgc.springbootssm1.dao.mapper;

import com.whgc.springbootssm1.bean.Employee;

import java.util.List;

public interface EmployeeMapper {
    public void addEmp(Employee employee);
    public void delEmp(Integer[] id);
    public void updateEmp(Employee employee);
    public List<Employee> findEmp();
    public Employee findOne(Integer id);
}
