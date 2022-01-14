package com.aaa.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Bed)床位（分科室）
 *
 * @author makejava
 * @since 2022-01-13 12:09:34
 */
@Data
public class Bed {
    private Integer bedid;
    private String bedname;
    private Deparment departmentid;
    private Integer state;
    private Double price;
}

