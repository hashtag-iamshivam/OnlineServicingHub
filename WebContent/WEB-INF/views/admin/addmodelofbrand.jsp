<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<body>
	
	<h1>Welcome to Add Model of Brand</h1>

	<form method="post">
		<table>
		<tr>
				<td><input type="text" name="brandType" value="${param.brandId}"/></td>
				<td><input type="text" name="brandType" value="${param.vehicleTypeId}"/></td>
			</tr>
			<tr>
				<td>Model :</td>
				<td><input type="text" name="vehicleModelName" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Model" /></td>
			</tr>
		</table>

	</form>
	
	<a href='<s:url value="/admin/listservices"></s:url>'>GO TO MAIN MENU</a>
</body>
</html>