package com.aaa.entity;

import java.io.Serializable;

/**
 * (Inoutpatienttype)住院收费项目实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public class Inoutpatienttype implements Serializable {
    private static final long serialVersionUID = -73132109180176660L;
    //序号
    private Integer inoutpatientid;
    //项目名称
    private String projectname;
    //单位
    private Integer unit;
    //项目分类
    private Integer bigprojectid;
    //单价
    private Object price;


    public Integer getInoutpatientid() {
        return inoutpatientid;
    }

    public void setInoutpatientid(Integer inoutpatientid) {
        this.inoutpatientid = inoutpatientid;
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

    public Integer getBigprojectid() {
        return bigprojectid;
    }

    public void setBigprojectid(Integer bigprojectid) {
        this.bigprojectid = bigprojectid;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

}

