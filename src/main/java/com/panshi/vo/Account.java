package com.panshi.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class Account implements Serializable {
    private int aid;
    private int auid;
    private double money;
}
