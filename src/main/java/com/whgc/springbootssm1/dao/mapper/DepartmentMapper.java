package com.whgc.springbootssm1.dao.mapper;

import com.whgc.springbootssm1.bean.Department;

import java.util.List;

public interface DepartmentMapper {
    public Department findById(Integer id);
    public List<Department> listAllDept();
}
