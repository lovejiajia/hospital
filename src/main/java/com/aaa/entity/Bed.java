package com.aaa.entity;

import java.io.Serializable;

/**
 * (Bed)床位实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public class Bed implements Serializable {
    private static final long serialVersionUID = 517974103885650268L;
    //序号
    private Integer bedid;
    //名称
    private String bedname;
    //科室
    private Integer departmentid;
    //状态
    private Integer state;
    //价格
    private Object price;


    public Integer getBedid() {
        return bedid;
    }

    public void setBedid(Integer bedid) {
        this.bedid = bedid;
    }

    public String getBedname() {
        return bedname;
    }

    public void setBedname(String bedname) {
        this.bedname = bedname;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Object getPrice() {
        return price;
    }

    public void setPrice(Object price) {
        this.price = price;
    }

}

