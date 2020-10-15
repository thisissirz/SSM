package com.whgc.springbootssm1.service.serviceimpl;

import com.whgc.springbootssm1.bean.Department;
import com.whgc.springbootssm1.dao.DepartmentDao;
import com.whgc.springbootssm1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceimpl implements DepartmentService {

    @Autowired
    DepartmentDao departmentDao;
    @Override
    public Department findByid(Integer id) {
        return departmentDao.findByid(id);
    }

    @Override
    public List<Department> listAllDept() {
        return departmentDao.listAllDept();
    }
}
