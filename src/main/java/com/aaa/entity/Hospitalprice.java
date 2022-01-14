package com.aaa.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Hospitalprice)病人开药记录
 *
 */
@Data
public class Hospitalprice{
    private Integer hospitalpriceid;
    private Register registerid;
    private String durgname;
    private Integer durgnum;
    private Double repiceprice;
    private Double repicetotal;
    private Date htime;
    private Integer state;
}

