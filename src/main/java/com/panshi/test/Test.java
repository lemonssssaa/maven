package com.panshi.test;

import com.panshi.common.Sql;
import com.panshi.mapper.StudentMapper;
import com.panshi.vo.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = Sql.getSqlSF().openSession(true);
        StudentMapper dao = sqlSession.getMapper(StudentMapper.class);
        List<Student> list = dao.queryAll();
    }

}
