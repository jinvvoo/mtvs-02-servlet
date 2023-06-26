
<!-- 지시자 태그 -->
<!-- 페이지 지시자 태그 (추가로 지시자 태그는 include, taglib 가 있다. -->
<!-- 지시자 태그 -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--jsp 파일로 잘 이동되는지 확인--%>

    <h1>JSP simple states</h1>
    <!-- HTML 주석 -->        <!-- 클라이언트한테 노출이 되는 주석 -->
    <%-- JSP 주석 --%>        <!-- 클라이언트한테 노출이 되지 않는 주석 -->

    <!-- 선언(declare) 태그 -->
    <%!
        private String name;
        private int age;
    %>

    <!-- 스크립트릿 태그 -->
    <%
        name = "홍길동";
        age = 20;

        System.out.println("name = " + name);
        System.out.println("age = " + age);

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    %>

    <!-- 표현(expression) 태크 -->
    name : <%=name %> <br>
    age : <%=age %> <br>


</body>
</html>
