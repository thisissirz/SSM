package com.whgc.springbootssm1;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.whgc.springbootssm1.bean.Employee;
import com.whgc.springbootssm1.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

@SpringBootTest
class Springbootssm1ApplicationTests {

    @Autowired
    DataSource dataSource;
    @Autowired
    EmployeeService empService;
    @Test
    void contextLoads() throws SQLException {
        System.out.println(dataSource);
        Connection conn = dataSource.getConnection();
        System.out.println("--------------"+conn);
        conn.close();
    }
    @Test
    public void find(){
        List<Employee> one = empService.listAllEmp();
        System.out.println(one);
    }
    @Test
    public void testPage(){
		
        PageHelper.startPage(6,5);
        List<Employee> emp = empService.listAllEmp();
        PageInfo page = new PageInfo(emp,5);//连续显示的页数
        System.out.println(page.getPageNum()+"第几页");//第几页
        System.out.println(page.getStartRow()+"开始于第几条数据");//开始于第几条数据
        System.out.println(page.getEndRow()+"结束于第几条");//结束于第几条
        System.out.println(page.getPages()+"页总数");//页总数
        System.out.println(page.getNavigateFirstPage()+"当前页码第一页");//
        System.out.println(page.getNavigateLastPage()+"当前页码最后一页");//
        System.out.println(page.getNavigatePages()+"当前处于最中间页");//
        System.out.println(page.getPrePage()+"前一页");//
        System.out.println(page.getNextPage()+"后一页");//
        System.out.println(page.getPageSize()+"页内的语句总数");//
        System.out.println(page.getNavigatepageNums()[1]+"页码集和");//
        System.out.println(page.getTotal()+"————————");

       /* List<Employee> list = page.getList();
        for (int i:page.getNavigatepageNums()) {
            System.out.println(i);
        }*/
    }
    @Test
    void testQuery(){
        empService.delEmp(new Integer[]{7});
        List<Employee> employees = empService.listAllEmp();
        System.out.println(employees.get(0));
    }

}
