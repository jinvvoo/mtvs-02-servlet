package com.ohgiraffers.section01.filter;

import com.sun.security.jgss.GSSUtil;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

//*의 의미 ?
@WebFilter("/first/*")
public class FirstFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init 호출됨...");
    }

    @Override
    public void destroy() {
        System.out.println("destroy 호출됨...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("Filter doFilter 호출됨...");

        /* 다음 핉터 호출, 더 이상 호출할 필터가 없다면 서블릿을 호출함. */
        chain.doFilter(request, response);

        System.out.println("Servlet 요청 수행 완료!");
    }
}
