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

<h4>You are On List brand Vehicle... Congrats</h4>
<p:forEach var="z" items="${sessionScope.list_brands}">

	<table style="border-style: solid;">
	 <tr>
			<td><input type="text" name="vehicleType" value="${param.vehicleTypeId}" /></td>
	</tr>
		<tr>
			<td>${z.brandName}</td>
		</tr>
		<tr>
			<td><a href='<s:url value="/admin/addmodelofbrand?brandId=${z.brandId}&vehicleTypeId=${param.vehicleTypeId}"></s:url>'>Add Models Of Brand</a></td>
		</tr>
</table>

</p:forEach> 
<br/>
<a href='<s:url value="/admin/services"></s:url>'>GO TO MAIN MENU</a>


</body>
</html>