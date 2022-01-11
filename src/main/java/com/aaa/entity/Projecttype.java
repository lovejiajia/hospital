package com.aaa.entity;

import java.io.Serializable;

/**
 * (Projecttype).项目类别实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public class Projecttype implements Serializable {
    private static final long serialVersionUID = 303568274956457700L;
    //序号
    private Integer projectid;
    //项目类别
    private String projectname;


    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

}

