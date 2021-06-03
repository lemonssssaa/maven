package com.panshi.vo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class User implements Serializable {
    private int uid;
    private String uname;
    private Date ubirthday;
    private char usex;
    private String uaddress;
    List<Account> account;
}
