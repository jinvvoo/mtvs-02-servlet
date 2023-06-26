<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>

    <h3>GET 방식의 요청</h3>
    <form action="request-service" method="GET">
      <input type = "submit" value="GET 방식 요청">
    </form>

    <h3>POST 방식의 요청</h3>
    <form action="request-service" method="POST">
        <input type = "submit" value="POST 방식 요청">
    </form>

</body>
</html>