<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4> Welcome , ${sessionScope.details.name}</h4>
<h3><a href='<s:url value="/vendor/logout"></s:url>'>LOG Out</a></h3>
</body>
</html>