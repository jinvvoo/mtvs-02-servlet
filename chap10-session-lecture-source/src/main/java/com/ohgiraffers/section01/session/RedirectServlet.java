package com.ohgiraffers.section01.session;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        System.out.println("redirect servlet session id : " + session.getId());


        String firstName = String.valueOf(session.getAttribute("firstName"));
        String lastName = String.valueOf(session.getAttribute("lastName"));

//        String lastName = (String) session.getAttribute("lastName").toString();

//        Enumeration<String> names = session.getAttributeNames();
//        for (String name : session.getAttributeNames()) {
//            System.out.println("name = " + name;
//        }

//z
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);


        //
    }
}
