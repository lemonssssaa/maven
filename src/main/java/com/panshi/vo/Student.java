package com.panshi.vo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Data
public class Student implements Serializable {
    private int sid;
    private String sname;
    private int sage;
    private String address;

}
