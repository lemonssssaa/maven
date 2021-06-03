package com.panshi.test;

import com.panshi.common.Sql;
import com.panshi.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;

public class Test {
    public static void main(String[] args) {
        SqlSession sqlSession = Sql.getSqlSF().openSession(true);
        StudentMapper dao = sqlSession.getMapper(StudentMapper.class);
        System.out.println(dao.queryUser());
        System.out.println(dao.queryUser().get(0).getUname());
    }
}
