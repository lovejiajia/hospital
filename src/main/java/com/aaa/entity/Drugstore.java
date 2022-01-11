package com.aaa.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Drugstore)药品仓库实体类
 *
 * @author makejava
 * @since 2022-01-10 17:47:08
 */
public class Drugstore implements Serializable {
    private static final long serialVersionUID = -56134557301628429L;
    //序号
    private Integer rugstoreid;
    //药品名称
    private String drugstorename;
    //供货单位Foreign key
    private Integer supplierid;
    //经办人Foreign key
    private Integer skullid;
    // 库房Foreign key
    private Integer warehouseid;
    //计量单位
    private Integer unit;
    //批发价
    private Object tradeprice;
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
    private String batch;


    public Integer getRugstoreid() {
        return rugstoreid;
    }

    public void setRugstoreid(Integer rugstoreid) {
        this.rugstoreid = rugstoreid;
    }

    public String getDrugstorename() {
        return drugstorename;
    }

    public void setDrugstorename(String drugstorename) {
        this.drugstorename = drugstorename;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
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

    public Object getTradeprice() {
        return tradeprice;
    }

    public void setTradeprice(Object tradeprice) {
        this.tradeprice = tradeprice;
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

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

}

