package com.ohgiraffers.section01.cookie;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);

//        req.setAttribute("firstName", firstName);
//        req.setAttribute("lastName", lastName);


        /* 필기.
        *   쿠키를 사용하는 방법
        *   1. 쿠키를 생성한다.
        *   2. 생성한 쿠키의 만료 시간을 설정한다.
        *   3. 응답 헤더에 쿠키를 담는다.
        *   4. 응답을 보낸다.
        *
        * 주의사항.
        *   1. 쿠키의 이름은 ascii 문자만을 이용해야 한다.
        *   2. 쿠키의 이름은 공백문자나 일부 특수 문자를 사용할 수 없다.
        *      ( [ ] ( ) = , " \ ? @ : ; )
        *   3. 쿠키의 이름은 설정 이후 변경할 수 없다.
        *
         */

        //이제 쿠키를 만들어보자!
        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);

        // 60초 60분 24시간
        firstNameCookie.setMaxAge(60 * 60 * 24);
        lastNameCookie.setMaxAge(60 * 60 * 24);

        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);




        // 필기. 쿠키는 키밸류 값을 담는 일종의 객체.



        // redirect 뒤에 ?
        // "redirect?firstName="
        resp.sendRedirect("redirect");


    }
}
