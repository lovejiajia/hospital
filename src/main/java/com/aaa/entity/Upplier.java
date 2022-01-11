package com.aaa.entity;

import java.io.Serializable;

/**
 * (Upplier)供货单位实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:14
 */
public class Upplier implements Serializable {
    private static final long serialVersionUID = -15239827206768637L;
    //序号
    private Integer supplierid;
    //供货单位
    private String suppliername;
    //联系电话
    private String supplierphone;
    //供货地址
    private String supplieraddress;
    //供货状态
    private Integer state;


    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSupplierphone() {
        return supplierphone;
    }

    public void setSupplierphone(String supplierphone) {
        this.supplierphone = supplierphone;
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}

