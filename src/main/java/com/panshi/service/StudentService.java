package com.panshi.service;

import com.panshi.vo.Student;

import java.util.List;

public interface StudentService {

    List<Student> findAllStu();

    List<Student> query(Student s);
}
