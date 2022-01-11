package com.aaa.entity;

import java.io.Serializable;

/**
 * (Departments).科室实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public class Departments implements Serializable {
    private static final long serialVersionUID = 739147399716549001L;
    //序号
    private Integer departmentid;
    //科室类型
    private String department;


    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}

