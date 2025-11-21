package com.itheima.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emp {
    private Integer id;          // 员工ID
    private String username;     // 用户名
    private String password;     // 密码
    private String name;         // 姓名
    private Byte gender;         // 性别 (1:男, 2:女)
    private String image;        // 头像路径
    private Integer job;         // 职位ID
    private LocalDate entrydate; // 入职日期
    private Integer deptId;      // 部门ID
    private LocalDateTime createTime; // 创建时间
}
