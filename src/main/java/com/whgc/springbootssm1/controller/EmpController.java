package com.whgc.springbootssm1.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whgc.springbootssm1.bean.Department;
import com.whgc.springbootssm1.bean.Employee;
import com.whgc.springbootssm1.service.DepartmentService;
import com.whgc.springbootssm1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;
import java.util.List;


@Controller
public class EmpController {
    @Autowired
    EmployeeService employeeService;
    @Autowired
    DepartmentService departmentService;

    @RequestMapping({"/emps{pn}","/"})
    public String loadPage(@RequestParam(value ="pn",defaultValue="1") Integer pn,Model model){
        PageHelper.startPage(pn,5);
        List<Employee> emps = employeeService.listAllEmp();
        PageInfo pageInfo = new PageInfo(emps,5);
        List<Department> departments = departmentService.listAllDept();
        model.addAttribute("depts",departments);
        model.addAttribute("emps",pageInfo);
        return "/employee";
    }
    @PostMapping("/update")
    public String update(Employee employee) throws IOException {
        employeeService.updateEmp(employee);
       return "redirect:/emps"+"?pn="+0;
    }
    @PostMapping("/delEmp{id,pn}")
    public String delEmp(Integer[] id,Integer pn){
        employeeService.delEmp(id);
        return "redirect:/emps"+"?pn="+pn;
    }
    @PostMapping("/delEmps")
    @ResponseBody
    public String delsemp(Integer[] empId){
        employeeService.delEmp(empId);
        return "success";
    }
    @RequestMapping("/addEmp")
    public String addEmp(Employee employee,Model model){
        int pn = 0;
        if(employee == null){
            int i = employeeService.listAllEmp().size()%5==0?employeeService.listAllEmp().size()/5:employeeService.listAllEmp().size()/5+1;
            pn = i;
            return "redirect:/emps"+"?pn="+pn;
        }
        employeeService.addEmp(employee);
        int i = employeeService.listAllEmp().size()%5==0?employeeService.listAllEmp().size()/5:employeeService.listAllEmp().size()/5+1;
        pn = i;
        return "redirect:/emps"+"?pn="+pn;
    }

}
