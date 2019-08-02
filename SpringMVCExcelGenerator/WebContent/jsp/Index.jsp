<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="downloadExcel" method="get" id="downloadExcel">
<h3>Spring MVC Excel Report </h3>
<input id="submitId" type="submit" value="Download Excel Report">
</form:form>
</body>
</html>