package com.aaa.entity;

import lombok.Data;

import java.util.Date;


/**
 * 病人
 */
@Data
public class Register{
    private Integer registerid;
    private String username;
    private Integer age;
    private String sex;
    private Deparment department;
    private Doctor doctor;
    private String diagnose;
    private String address;
    private String phone;
    private String idcard;
    private Date registerdate;
    private Integer bednum;
    private String operator;
    private Double money;
    private Integer state;
    private Date enddate;
    private Double price;
    private String discount;

}


