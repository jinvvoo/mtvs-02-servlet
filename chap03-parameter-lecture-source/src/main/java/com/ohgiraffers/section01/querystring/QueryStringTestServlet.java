package com.ohgiraffers.section01.querystring;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

@WebServlet("/querystring")
public class QueryStringTestServlet extends HttpServlet {   //extend로 httpservlet 상속 받기


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //req = reqsuest
        //resp = response

        String name = request.getParameter("name");
        System.out.println("name = " + name);

        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("age = " + age);

//        java.sql.Date birthday = request.getParameter("birthday");

        // 2023-06-07
//        String tempDate = request.getParameter("birthday");
//        String[] arr = tempDate.split("-");
//        int year = Integer.parseInt(arr[0]);
//        int month = Integer.parseInt(arr[1]);
//        int date = Integer.parseInt(arr[2]);
//
//        Calendar calendar = new GregorianCalendar(year, month - 1, date); //month를 -1 하는 이유는?
//        java.sql.Date birthday = new java.sql.Date(calendar.getTimeInMillis());


//        System.out.println("birthday = " + birthday);

        java.sql.Date birthday = java.sql.Date.valueOf(request.getParameter("birthday"));
        System.out.println("birthday = " + birthday);
        System.out.println(birthday instanceof java.sql.Date); //맞으면 true 틀리면 false

        String gender = request.getParameter("gender");
        System.out.println("gender = " + gender);

        String national = request.getParameter("national");
        System.out.println("national = " + national);


        String[] hobbies = request.getParameterValues("hobbies");
        for (String hobby : hobbies) {
            System.out.println("hobby = " + hobby);
        }


    }
}

