package com.panshi.service.impl;

import com.panshi.common.Sql;
import com.panshi.dao.StudentDao;
import com.panshi.dao.impl.StudentDaoImpl;
import com.panshi.service.StudentService;
import com.panshi.vo.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private SqlSession sqlSession = Sql.getSqlSF().openSession();
    private StudentDao dao= sqlSession.getMapper(StudentDao.class);

    @Override
    public List<Student> findAllStu() {
        return dao.queryAll();
    }

    @Override
    public List<Student> query(Student s) {
        List<Student> list = dao.query(s);
        if(list == null || list.isEmpty()){
            return null;
        }
        return list;
    }
}
