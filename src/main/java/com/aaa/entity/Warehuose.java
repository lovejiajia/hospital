package com.aaa.entity;

import java.io.Serializable;

/**
 * (Warehuose)库房实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:14
 */
public class Warehuose implements Serializable {
    private static final long serialVersionUID = 910213562530077616L;
    //序号
    private Integer warehouseid;
    //库房名
    private String suppliername;


    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

}

