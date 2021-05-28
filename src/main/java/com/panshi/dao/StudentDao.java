package com.panshi.dao;

import com.panshi.vo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface StudentDao {
    List<Student> query();
    int addStu();
    int delStu();
    int updStu();
}