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
<p:forEach var="z" items="${sessionScope.ListTypeOfVehicle}">

	<table style="border-style: solid;">
		<tr>
			<td>${z.vehicleTypeName}</td>
		</tr>
		<tr>
			<td><a href='<s:url value="/admin/updatetypeofvehicle?vehicleTypeId=${z.vehicleTypeId}"></s:url>'>Update</a></td>                            
			<td><a href='<s:url value="/admin/deletetypeofvehicle?vehicleTypeId=${z.vehicleTypeId}"></s:url>'>Delete</a></td> 	
			<td><a href='<s:url value="/admin/addbrandofvehicle?vehicleTypeId=${z.vehicleTypeId}&vehicleTypeName=${z.vehicleTypeName}"></s:url>'>Add Brand's Of Vehicle</a></td>
			<td><a href='<s:url value="/admin/listbrandofvehicle?vehicleTypeId=${z.vehicleTypeId}&vehicleTypeName=${z.vehicleTypeName}"></s:url>'>List Brand's Of Vehicles</a></td>	
		</tr>
	
</table>

</p:forEach>
<br/>
<a href='<s:url value="/admin/services"></s:url>'>GO TO MAIN MENU</a>


</body>
</html>