package com.whgc.springbootssm1.dao.Daoimpl;

import com.whgc.springbootssm1.dao.EmployeeDao;
import com.whgc.springbootssm1.dao.mapper.EmployeeMapper;
import com.whgc.springbootssm1.bean.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDaoimpl implements EmployeeDao {
    @Autowired
    EmployeeMapper employeeMapper;

    @Override
    public void addEmp(Employee employee) {
        employeeMapper.addEmp(employee);
    }

    @Override
    public void delEmp(Integer[] id) {
        employeeMapper.delEmp(id);
    }

    @Override
    public void updateEmp(Employee employee) {
        employeeMapper.updateEmp(employee);
    }

    @Override
    public List<Employee> listAllEmp() {
        return employeeMapper.findEmp();
    }

    @Override
    public Employee findOneEmp(Integer id) {
        return employeeMapper.findOne(id);
    }
}
