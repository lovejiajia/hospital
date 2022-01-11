package com.aaa.entity;

import java.io.Serializable;

/**
 * (Area)药品产地实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
public class Area implements Serializable {
    private static final long serialVersionUID = -40664108242078140L;
    //序号
    private Integer areaid;
    //产地
    private String areaname;


    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

}

