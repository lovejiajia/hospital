package com.aaa.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Home)门诊病人
 *
 * @author makejava
 * @since 2022-01-14 17:11:39
 */
@Data
public class Home implements Serializable {
    private Integer homeid;
    private String homename;
    private String sex;
    private Integer age;
    private String carid;
    private String phone;
}

