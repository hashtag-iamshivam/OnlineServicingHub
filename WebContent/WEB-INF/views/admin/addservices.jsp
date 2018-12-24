<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	 <%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h1>Welcome to the services</h1>

	<form method="post">
		<table>
			<tr>
				<td>Services</td>
				<td><input type="text" name="servicetype" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Service" /></td>
			</tr>
		</table>

	</form>
	
	<a href='<s:url value="/admin/services"></s:url>'>GO TO MAIN MENU</a>
</body>
</html>