package com.whgc.springbootssm1.dao.Daoimpl;

import com.whgc.springbootssm1.bean.Department;
import com.whgc.springbootssm1.dao.DepartmentDao;
import com.whgc.springbootssm1.dao.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class DepartmentDaoimpl implements DepartmentDao {
    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public Department findByid(Integer id) {
        return departmentMapper.findById(id);
    }

    @Override
    public List<Department> listAllDept() {
        return departmentMapper.listAllDept();
    }
}
