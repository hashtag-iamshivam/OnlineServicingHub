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
<p:forEach var="z" items="${sessionScope.allVendor}">

	<table>
		<tr>
				<td>${z.name}</td>
				<td>${z.email}</td>
				<td>${z.city}</td>
				<td>${z.phoneNo}</td>
				<td> <a href='<s:url value="/vendor/update?vid=${z.id}"></s:url>'>Update</a> </td>
				<td><a href="<s:url value='/vendor/delete?vid=${z.id}'/>">Delete</a></td>
		</tr>
	
</table>
</p:forEach>


		<a href="<s:url value='/vendor/add'/>">Add New Vendor</a>


</body>
</html>