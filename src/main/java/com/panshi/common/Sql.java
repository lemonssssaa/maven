package com.panshi.common;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Sql {
    private static SqlSessionFactory sqlSessionFactory = null;
    public static SqlSessionFactory getSqlSF() {
        if(!(sqlSessionFactory == null)){
            return sqlSessionFactory;
        }
        String resource = "com/panshi/dao/SqlMapConfig.xml";
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory;
    }
}
