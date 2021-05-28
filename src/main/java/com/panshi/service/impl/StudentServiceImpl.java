package com.panshi.service.impl;

import com.panshi.dao.StudentDao;
import com.panshi.dao.impl.StudentDaoImpl;
import com.panshi.service.StudentService;
import com.panshi.vo.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao dao = new StudentDaoImpl();

    @Override
    public List<Student> findAllStu() {
        return dao.query();
    }
}
