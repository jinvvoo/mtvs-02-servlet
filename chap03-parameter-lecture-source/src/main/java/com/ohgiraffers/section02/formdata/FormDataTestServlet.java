package com.ohgiraffers.section02.formdata;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/formdata")
public class FormDataTestServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println(request.getCharacterEncoding()); //10ver 에선 한글인코딩 꺠지지 않는 상황.
//        //예전 환경이라면 이걸 출력해서 확인해봐야함.
//        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        System.out.println("name = " + name);
    }
}


