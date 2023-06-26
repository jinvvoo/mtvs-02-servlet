
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>include directive</h1>
    <div><%@ include file="today.jsp" %></div>
    <%
        //String output = "";   //include를 하였기 때문에 today.jsp 내부에 있던 output이라는 변수명 사용 금지
    %>
</body>
</html>
