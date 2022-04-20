<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String context = request.getContextPath();

%>
<h1>
	s14_home.jsp<br/>
	==================
</h1>

<form action="/ex/s14_studentInfo" method="post">
이름 : <input type="text" name="name" size="20"><br />
나이 : <input type="text" name="age" size="20"><br />
학년 : <input type="text" name="gradeNum" size="20"><br />
학급 : <input type="text" name="classNum" size="20"><br />
<input type="submit" value="전송" >
</form>
</body>
</html>