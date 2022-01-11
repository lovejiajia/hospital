package com.aaa.entity;

import java.io.Serializable;

/**暂无用
 * (Baoque)实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:07
 */
public class Baoque implements Serializable {
    private static final long serialVersionUID = -45626551622254946L;
    
    private Integer baoqueid;
    
    private String baoquename;
    
    private Integer baoquenum;


    public Integer getBaoqueid() {
        return baoqueid;
    }

    public void setBaoqueid(Integer baoqueid) {
        this.baoqueid = baoqueid;
    }

    public String getBaoquename() {
        return baoquename;
    }

    public void setBaoquename(String baoquename) {
        this.baoquename = baoquename;
    }

    public Integer getBaoquenum() {
        return baoquenum;
    }

    public void setBaoquenum(Integer baoquenum) {
        this.baoquenum = baoquenum;
    }

}

