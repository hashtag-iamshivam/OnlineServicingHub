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

<h4>List is as Follows</h4>
<p:forEach var="z" items="${sessionScope.Services_details}">

	<table>
		<tr>
			<td>${z.serviceName}</td>
			<td><a href='<s:url value="/admin/updateservice?serviceId=${z.serviceId}"></s:url>'>Update</a></td>                            
			<td><a href='<s:url value="/admin/deleteservice?serviceId=${z.serviceId}"></s:url>'>Delete</a></td>
				
		</tr>
	
</table>

</p:forEach>

<a href='<s:url value="/admin/services"></s:url>'>GO TO MAIN MENU</a>

</body>
</html>