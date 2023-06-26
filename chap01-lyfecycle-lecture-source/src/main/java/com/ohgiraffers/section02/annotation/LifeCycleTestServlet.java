package com.ohgiraffers.section02.annotation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class LifeCycleTestServlet extends HttpServlet{

    @WebServlet(value="/annotation-lifecycle")
    public class LifeCycleTestServet extends HttpServlet {
        private int serviceCount = 1;
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            System.out.println("annotation 매핑 doGet() 메소드 호출 :" + serviceCount);
        }
    }
}
