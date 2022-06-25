<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>
<h1 style="color:green;">${msg }</h1>
<h1>Email:- ${user.email }</h1>
<h1>Username:- ${user.username }</h1>
<h1>Password:- ${user.password }</h1>
</body>
</html>