<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
    <h1>My name is prince kumar</h1>
    <h1> I am a software Engineer</h1>
    
    <%    String name=(String)request.getAttribute("name"); %>
    
    <h1>name is :<%= name %></h1>
</body>
</html>