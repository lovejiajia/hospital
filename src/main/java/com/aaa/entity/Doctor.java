package com.aaa.entity;

import lombok.Data;

/**
 * 医生
 */
@Data
public class Doctor {
    private int doctorId;
    private String doctorName;
    private Deparment deparment;
    private Registered registered;
    private int dstate;//状态
}
