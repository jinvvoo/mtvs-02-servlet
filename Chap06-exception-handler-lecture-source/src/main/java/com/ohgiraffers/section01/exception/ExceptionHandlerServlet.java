package com.ohgiraffers.section01.exception;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/showErrorPage")
public class ExceptionHandlerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        System.out.println("오니??");
        Enumeration<String> attrNames = req.getAttributeNames();
        while (attrNames.hasMoreElements()) {
            System.out.println(attrNames.nextElement());

        }

        System.out.println("test");
//        String statusCode = req.getAttribute("jakarta.servlet.error.status_code");
//        String message = req.getAttribute("jakarta.servlet.error.message");

        String statusCode = req.getAttribute("jakarta.servlet.error.status_code").toString();
        String message = req.getAttribute("jakarta.servlet.error.message").toString();


        System.out.println("statusCode = " + statusCode);
        System.out.println("message =" + message);





        StringBuilder errorPage = new StringBuilder();
        errorPage.append("<!doctype html>\n")
                .append("<html>\n")
                .append("<head></head>")
                .append("<body>\n")
                .append("<h1>\n")
                .append(statusCode)
                .append(" - ")
                .append(message)
                .append("<h1>\n")
                .append("</body>\n")
                .append("</html>\n");

        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();

        out.print(errorPage.toString());
        out.flush();
        out.close();

    }
}
