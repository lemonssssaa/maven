package com.panshi.dao.impl;

import com.panshi.dao.StudentDao;
import com.panshi.common.Sql;
import com.panshi.vo.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> query(Student stu) {
        SqlSession session = Sql.getSqlSF().openSession();
        List<Student> list = session.selectList("findAllStu",stu);
        session.close();
        return list;
    }

    @Override
    public List<Student> findAllStu(Student stu) {
        return null;
    }

    @Override
    public List<Student> queryAll() {
        return null;
    }

    @Override
    public int addStu() {
        return 0;
    }

    @Override
    public int delStu() {
        return 0;
    }

    @Override
    public int updStu() {
        return 0;
    }
}
