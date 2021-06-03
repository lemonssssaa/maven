package com.panshi.mapper;

import com.panshi.vo.Account;
import com.panshi.vo.Student;
import com.panshi.vo.User;

import java.util.List;

public interface StudentMapper {
    List<Student> queryAll();
    List<User> queryUser();
    List<Account> queryAccoutByUid();
}
