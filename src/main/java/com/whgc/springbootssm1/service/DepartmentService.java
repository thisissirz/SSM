package com.whgc.springbootssm1.service;

import com.whgc.springbootssm1.bean.Department;

import java.util.List;

public interface DepartmentService {
    public Department findByid(Integer id);
    public List<Department> listAllDept();
}
