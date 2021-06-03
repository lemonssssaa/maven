package com.panshi.service.impl;

import com.panshi.common.Sql;
import com.panshi.mapper.StudentMapper;
import com.panshi.service.StudentService;
import org.apache.ibatis.session.SqlSession;

public class StudentServiceImpl implements StudentService {
    private SqlSession sqlSession = Sql.getSqlSF().openSession();
    private StudentMapper dao= sqlSession.getMapper(StudentMapper.class);

}
