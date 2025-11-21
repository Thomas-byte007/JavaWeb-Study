package com.itheima.mapper;

import com.itheima.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface EmpMapper {

    //根据ID删除数据
    @Delete("delete from emp where id = #{id}")
    public void delete(Integer id);

    //插入员工
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username,password, name, gender, image, job, entrydate, dept_id, create_time)" +
            "values(#{username},#{password},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime})")
    public void Insert(Emp emp);

    //更新员工
    @Update("update emp set username = #{username},name = #{name},gender=#{gender},iamge=#{2.jpg},job=#{job}," +
            "entrydate=#{entrydate},dept_id=#{deptId}")
    public void Update(Emp emp);

    //查询员工
    @Select("select * from emp where id=#{id}")
    public Emp getById(Integer id);

    /*//条件查询员工
    @Select("select * from emp where name like concat('%',#{name},'%') and gender =  #{gender} and" +
            "entrydate between #{begin} and #{end} order by create_time desc")
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
    */
    //动态条件查询
    public List<Emp> list(String name,Short gender,LocalDate begin,LocalDate end);

    public void Update2(Emp emp);
}
