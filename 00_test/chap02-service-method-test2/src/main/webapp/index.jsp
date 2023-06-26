<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
    <h3>GET 방식 요청</h3>
    <h4>form 태그</h4>
    <form action="request-service" method="GET">
      <input type="submit" value="GET요청방식">
    </form>

    <h3>POST 방식 요청</h3>
    <h4>form 태그</h4>
    <form action="request-service" method="POST">
        <p>이름 : </p>
        <input type="submit" value="POST요청방식">
    </form>
</body>
</html>