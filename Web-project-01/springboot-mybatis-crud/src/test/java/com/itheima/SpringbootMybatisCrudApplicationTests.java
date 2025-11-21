package com.itheima;

import com.itheima.mapper.EmpMapper;
import com.itheima.pojo.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
public class SpringbootMybatisCrudApplicationTests {
    @Autowired
    private EmpMapper empMapper;

    @Test
    public void testDelete(){
        empMapper.delete(17);
    }
    @Test
    public void testInsert(){
        Emp emp = new Emp();
        emp.setId(1);
        emp.setUsername("zhangsan");
        emp.setPassword("123456");
        emp.setName("张三");
        emp.setGender((byte) 1);   // 注意：需要强制转换为 byte，因为 1 是 int 类型
        emp.setImage("/images/avatar.png");
        emp.setJob(1);
        emp.setEntrydate(LocalDate.now());
        emp.setDeptId(2);
        emp.setCreateTime(LocalDateTime.now());
        empMapper.Insert(emp);
        System.out.println(emp.getId());
    }

    @Test
    public void testSelect(){
        empMapper.getById(1);
    }

    @Test
    public void testSelect2(){
       List<Emp> empList = empMapper.list(null,null,null,null);
       System.out.println(empList);
    }

    @Test
    public void testUpdate2(){
        Emp emp = new Emp();
        emp.setId(17);
        emp.setUsername("lisi");
        emp.setName("李四");
        emp.setGender((byte) 1);
        emp.setCreateTime(LocalDateTime.now());

        empMapper.Update2(emp);
    }

}
