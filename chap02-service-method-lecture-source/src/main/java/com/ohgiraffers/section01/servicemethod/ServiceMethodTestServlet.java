package com.ohgiraffers.section01.servicemethod;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/request-service")
//@WebServlet(value = "/request-service", loadOnStartup = 0)
public class ServiceMethodTestServlet extends HttpServlet {
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("service() 메소드 호출됨...");
//
//        String httpMethod = req.getMethod();
//        System.out.println("httpMethod = " + httpMethod);
//
//        if ("GET".equals(httpMethod)) {
//            doGet(req, resp);
//        } else if ("POST".equals(httpMethod)) {
//            doPost(req, resp);
//
//        }
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("GET 요청을 처리할 메소드 호출");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("POST 요청을 처리할 메소드 호출");
    }
}
