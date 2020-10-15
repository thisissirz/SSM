package com.whgc.springbootssm1.service.serviceimpl;

import com.whgc.springbootssm1.dao.EmployeeDao;
import com.whgc.springbootssm1.service.EmployeeService;
import com.whgc.springbootssm1.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceimpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee findOne(Integer id) {
        return employeeDao.findOneEmp(id);
    }

    @Override
    public List<Employee> listAllEmp() {
        return employeeDao.listAllEmp();
    }

    @Override
    public void addEmp(Employee employee) {
        employeeDao.addEmp(employee);
    }

    @Override
    public void delEmp(Integer[] id) {
        employeeDao.delEmp(id);
    }

    @Override
    public void updateEmp(Employee employee) {
        employeeDao.updateEmp(employee);
    }
}
