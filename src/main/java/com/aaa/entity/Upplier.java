package com.aaa.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Upplier)供货单位
 *
 * @author makejava
 * @since 2022-01-14 15:00:08
 */
@Data
public class Upplier  {
    private Integer supplierid;
    private String suppliername;
    private String supplierphone;
    private String supplieraddress;
    private Integer state;

}

