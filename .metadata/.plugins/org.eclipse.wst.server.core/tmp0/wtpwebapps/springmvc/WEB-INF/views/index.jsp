<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home page</title>
</head>
<body>
     <h1>THis is home page</h1>
     <h1>Calling from home method</h1>
     <h1>from home controller</h1>
     
     
     <%
         String name=(String)request.getAttribute("name");
      %>
      
      <h1>name is :<%=name%></h1>
</body>
</html>