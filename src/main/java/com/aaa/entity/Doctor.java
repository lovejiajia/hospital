package com.aaa.entity;

import lombok.Data;

/**
 * ε»η
 */
@Data
public class Doctor {
    private int doctorId;
    private String doctorName;
    private Deparment deparment;
    private Registered registered;
    private int dstate;//ηΆζ
}
