package com.aaa.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * (Pay)病人支付详情
 *
 * @author makejava
 * @since 2022-01-13 12:41:44
 */
@Data
public class Pay {
    private Integer payid;
    private Register registerid;
    private Double money;
    private Date paydate;
}

