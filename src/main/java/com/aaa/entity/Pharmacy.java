package com.aaa.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Pharmacy)药房实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:12
 */
public class Pharmacy implements Serializable {
    private static final long serialVersionUID = -76606306528430967L;
    
    private Integer pharmacyid;
    //药品名称
    private String pharmacyname;
    //领货单位Foreign key
    private Integer drugstoreid;
    //经办人Foreign key
    private Integer skullid;
    //库房Foreign key
    private Integer warehouseid;
    //计量单位
    private Integer unit;
    //售价
    private Object sellingprice;
    //产地
    private Integer area;
    //类型
    private Integer type;
    //生产日期
    private Date producedate;
    //有效期
    private Date validdate;
    //数量
    private Integer drugstorenum;
    //批号
    private String skullbatch;


    public Integer getPharmacyid() {
        return pharmacyid;
    }

    public void setPharmacyid(Integer pharmacyid) {
        this.pharmacyid = pharmacyid;
    }

    public String getPharmacyname() {
        return pharmacyname;
    }

    public void setPharmacyname(String pharmacyname) {
        this.pharmacyname = pharmacyname;
    }

    public Integer getDrugstoreid() {
        return drugstoreid;
    }

    public void setDrugstoreid(Integer drugstoreid) {
        this.drugstoreid = drugstoreid;
    }

    public Integer getSkullid() {
        return skullid;
    }

    public void setSkullid(Integer skullid) {
        this.skullid = skullid;
    }

    public Integer getWarehouseid() {
        return warehouseid;
    }

    public void setWarehouseid(Integer warehouseid) {
        this.warehouseid = warehouseid;
    }

    public Integer getUnit() {
        return unit;
    }

    public void setUnit(Integer unit) {
        this.unit = unit;
    }

    public Object getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(Object sellingprice) {
        this.sellingprice = sellingprice;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getProducedate() {
        return producedate;
    }

    public void setProducedate(Date producedate) {
        this.producedate = producedate;
    }

    public Date getValiddate() {
        return validdate;
    }

    public void setValiddate(Date validdate) {
        this.validdate = validdate;
    }

    public Integer getDrugstorenum() {
        return drugstorenum;
    }

    public void setDrugstorenum(Integer drugstorenum) {
        this.drugstorenum = drugstorenum;
    }

    public String getSkullbatch() {
        return skullbatch;
    }

    public void setSkullbatch(String skullbatch) {
        this.skullbatch = skullbatch;
    }

}

