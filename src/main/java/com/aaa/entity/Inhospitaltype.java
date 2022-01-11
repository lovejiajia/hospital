package com.aaa.entity;

import java.io.Serializable;

/**
 * (Inhospitaltype)住院收费实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:10
 */
public class Inhospitaltype implements Serializable {
    private static final long serialVersionUID = -55885767023109649L;
    //序号
    private Integer inhospitalid;
    //类型
    private String projectname;
    //单位
    private Integer unit;
    //单价
    private Object price;
    //项目分类
    private Integer bigprojectid;


    public Integer getInhospitalid() {
        return inhospitalid;
    }

    public void setInhospitalid(Integer inhospitalid) {
        this.inhospitalid = inhospitalid;
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

    public Integer getBigprojectid() {
        return bigprojectid;
    }

    public void setBigprojectid(Integer bigprojectid) {
        this.bigprojectid = bigprojectid;
    }

}

