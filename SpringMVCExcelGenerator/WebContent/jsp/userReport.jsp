<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Report </title>
</head>
<body>
<table border="1"> 
<thead><tr>
<td>ID</td>
<td>User Name</td>
<td>First Name</td>
<td>Last Name</td>
</tr></thead>
<tbody>
<c:forEach items="${userList}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.userName}</td>
<td>${user.firstName}</td>
<td>${user.lastName}</td>
</tr>
</c:forEach>
</tbody>

</table>
<spring:url value="/downloadExcel?type=excel" var="xlsURL"></spring:url>
<a href="${xlsURL}">Download Excel Report</a>

</body>
</html>