package com.panshi.vo;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
public class Student {
    private int id;

    private String name;

    List<Tec> tec;

}
