package com.whgc.springbootssm1.dao;

import com.whgc.springbootssm1.bean.Department;

import java.util.List;

public interface DepartmentDao {
    public Department findByid(Integer id);
    public List<Department> listAllDept();
}
