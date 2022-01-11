package com.aaa.entity;

import java.io.Serializable;

/**
 * (Unit)创建计量单位实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:13
 */
public class Unit implements Serializable {
    private static final long serialVersionUID = -99102417043481470L;
    //序号
    private Integer unitid;
    //单位
    private String unitname;


    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

}

