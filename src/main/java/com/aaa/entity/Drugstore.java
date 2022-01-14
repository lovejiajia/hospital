package com.aaa.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Drugstore)药品采购记录
 *
 * @author makejava
 * @since 2022-01-14 14:53:55
 */
@Data
public class Drugstore {
    private Integer rugstoreid;
    private String drugstorename;
    private Upplier supplierid;
    private Skull skullid;
    private Warehuose warehouseid;
    private Unit unit;
    private Double tradeprice;
    private Double sellingprice;
    private Area area;
    private Type type;
    private Date producedate;
    private Date validdate;
    private Integer drugstorenum;
    private String batch;

}

