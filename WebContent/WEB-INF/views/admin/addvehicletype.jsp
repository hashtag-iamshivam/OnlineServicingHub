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
	
	<h1>Welcome to Add Types of Vehicle</h1>

	<form method="post">
		<table>
			<tr>
				<td>Type Of Vehicle</td>
				<td><input type="text" name="vehicletype" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Vehicle Type" /></td>
			</tr>
		</table>

	</form>
	
	<a href='<s:url value="redirect:/admin/services"></s:url>'>GO TO MAIN MENU</a>
</body>
</html>