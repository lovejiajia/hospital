package com.aaa.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Report)门诊病人实体类
 *
 * @author makejava
 * @since 2022-01-16 14:51:30
 */
@Data
public class Report {
    private Integer reportid;
    private String reportname;
    private String sex;
    private Integer age;
    private Deparment department;
    private Doctor doctor;
    private Registeredtype reporttype;
    private Double price;
    private Date time;
    private String users;
    private Integer state;
    private String phone;
    private String carid;
    private String zhuan;


}

