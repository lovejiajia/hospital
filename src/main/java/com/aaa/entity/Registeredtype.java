package com.aaa.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * 医生挂号类型（普通号、专家号）
 */
@Data
public class Registeredtype {
    private Integer registeredid;
    private String type;
    private Double price;
}

