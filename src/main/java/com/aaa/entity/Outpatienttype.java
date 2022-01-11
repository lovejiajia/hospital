package com.aaa.entity;

import java.io.Serializable;

/**
 * (Outpatienttype)门诊收费项目实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:11
 */
public class Outpatienttype implements Serializable {
    private static final long serialVersionUID = -44747381612139468L;
    //序号
    private Integer outpatientid;
    //项目名称
    private String projectname;
    //单位
    private Integer unit;
    //项目分类
    private Integer bigprojectid;
    //单价
    private Object price;
    
    private Integer ostate;


    public Integer getOutpatientid() {
        return outpatientid;
    }

    public void setOutpatientid(Integer outpatientid) {
        this.outpatientid = outpatientid;
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

    public Integer getOstate() {
        return ostate;
    }

    public void setOstate(Integer ostate) {
        this.ostate = ostate;
    }

}

