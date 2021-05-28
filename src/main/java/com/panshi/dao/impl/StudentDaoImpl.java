package com.panshi.dao.impl;

import com.panshi.dao.StudentDao;
import com.panshi.test.Sql;
import com.panshi.vo.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public List<Student> query() {
        SqlSession session = Sql.getSqlSF().openSession();
        List<Student> list = session.selectList("findAllStu");
        session.close();
        return list;
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
