package com.aaa.entity;

import java.io.Serializable;

/**
 * (Drugdictionary)药品清单
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public class Drugdictionary implements Serializable {
    private static final long serialVersionUID = 812542374207763099L;
    //序号
    private Integer drugid;
    //药品名称
    private String drugname;
    // 计量单位
    private Integer unitid;
    //售价
    private Object sellingprice;
    //产地
    private Integer areaid;
    //类型
    private Integer typeid;


    public Integer getDrugid() {
        return drugid;
    }

    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public Integer getUnitid() {
        return unitid;
    }

    public void setUnitid(Integer unitid) {
        this.unitid = unitid;
    }

    public Object getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Object sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getAreaid() {
        return areaid;
    }

    public void setAreaid(Integer areaid) {
        this.areaid = areaid;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

}

