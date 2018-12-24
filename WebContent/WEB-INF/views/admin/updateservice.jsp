<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
    
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Please update the Services</h1>

	<s:form method="post" modelAttribute="getservicetype">
	
		<table>
			<tr>
				<td> Services :</td>
				<td><s:input path="serviceName"/></td>
			</tr>
			<tr>
				<td> Services :</td>
				<td><input type="submit" value="Update Service" /></td>
			</tr>
		</table>
		
	</s:form>
	

</body>
</html>