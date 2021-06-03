package com.panshi.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.panshi.service.StudentService;
import com.panshi.service.impl.StudentServiceImpl;
import com.panshi.vo.Student;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;
@WebServlet("/student")
public class StudentController extends HttpServlet {
    private StudentService ss = new StudentServiceImpl();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
