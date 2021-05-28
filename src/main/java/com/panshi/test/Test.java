package com.panshi.test;

import com.alibaba.fastjson.JSONObject;
import com.panshi.vo.Student;
import com.panshi.vo.Tec;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SqlSession session = Sql.getSqlSF().openSession();
        System.out.println(session.selectList("query"));
    }
}
