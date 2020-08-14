<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 YOU HAVE VISITED THIS SERVER THIS MANY TIMES: <c:out value="${yee}"/>

 <h3><c:out value="${key_msg}"/></h3>
 <a href="/">Test Another visit</a>
 <a href="/reset-counter">reset counter</a>

</body>
</html>