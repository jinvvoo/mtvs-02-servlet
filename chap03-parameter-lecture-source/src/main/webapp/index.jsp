<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Request parameter</title>

    <meta charset="UTF-8">
</head>
<body>

    <h1>Request parameter</h1>
    <h3>GET 방식의 요청</h3>
    <h4>form 태그를 이용한 GET 방식 요청</h4>
    <form action="querystring" method="get">
        <label>이름: </label>
<%--        <input type="text" name="name" value="홍길동">--%>
<%--        value값 넣으면 고정 --%>
        <input type="text" name="name" value="홍길동">
        <br>
        <label>나이: </label>
        <input type="number" name="age">       <%--숫자만 입력 가능--%>
        <br>
        <label>생일: </label>
        <input type="date" name="birthday">
        <br>
        <label>성별: </label>
        <input type="radio" name="gender" id="male" value="M"> <label for="male">남자</label>
        <input type="radio" name="gender" id="female" value="F"> <label for="female">여자</label>
        <br>
        <label>국적: </label>
        <select name="national">
            <option value="ko">한국</option>
            <option value="ch">중국</option>
            <option value="jp">일본</option>
            <option value="etc">기타</option>
        </select>
        <br>
        <label>취미: </label>
        <input type="checkbox" id="movie" value="movie" name="hobbies"><label for="movie">영화</label>
        <input type="checkbox" id="music" value="music" name="hobbies"><label for="music">노래</label>
        <input type="checkbox" id="sleep" value="sleep" name="hobbies"><label for="sleep">취침</label>
        <br>

        <input type="submit" value="GET 요청">
    </form>

    <h4>a 태그의 href 속성에 직접 파라미터를 쿼리스트링 형태로 작성하여 get방식 요청</h4>
    <a href="http://localhost:8080/querystring?name=%ED%99%8D%EA%B8%B8%EB%8F%99&age=22&birthday=2023-06-07&gender=M&national=ko&hobbies=movie&hobbies=music&hobbies=sleep">
        쿼리스트링을 이용한 값 전달
    </a>

    <h4>form 태그를 이용한 post 방식 요청</h4>
    <form action="formdata" method="post">
        <label>이름: </label>
        <%--        <input type="text" name="name" value="홍길동">--%>
        <input type="text" name="name" value="홍길동">
        <br>
        <label>나이: </label>
        <input type="number" name="age">       <%--숫자만 입력 가능--%>
        <br>
        <label>생일: </label>
        <input type="date" name="birthday">
        <br>
        <label>성별: </label>
        <input type="radio" name="gender" id="male2" value="M"> <label for="male2">남자</label>
        <input type="radio" name="gender" id="female2" value="F"> <label for="female2">여자</label>
        <br>
        <label>국적: </label>
        <select name="national">
            <option value="ko">한국</option>
            <option value="ch">중국</option>
            <option value="jp">일본</option>
            <option value="etc">기타</option>
        </select>
        <br>
        <label>취미: </label>
        <input type="checkbox" id="movie2" value="movie" name="hobbies"><label for="movie2">영화</label>
        <input type="checkbox" id="music2" value="music" name="hobbies"><label for="music2">노래</label>
        <input type="checkbox" id="sleep2" value="sleep" name="hobbies"><label for="sleep2">취침</label>
        <br>

        <input type="submit" value="POST 요청">
    </form>


</body>
</html>