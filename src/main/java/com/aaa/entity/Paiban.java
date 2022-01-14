package com.aaa.entity;

import lombok.Data;

/**
 * 医生一周排班表
 */
@Data
public class PaiBan {
    private int paiId;
    private String one;
    private String two;
    private String three;
    private String four;
    private String five;
    private String six;
    private String seven;
    private Doctor doctor;
}
