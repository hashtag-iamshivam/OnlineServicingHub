<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
      <%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p" %>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
    
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello Show list here</h1>
	
	<spring:form method="post" modelAttribute="typeservices">
	
		<p:forEach var="z" items="${sessionScope.servicesdetails}">
	
				<spring:checkbox path="serviceName" value="${z.serviceName}"/>${z.serviceName}
		</p:forEach> 		
		
		<input type="submit"  value="Add Service for Customers"/>
	</spring:form>
	
	
	<form method="post">
	
	
	<%-- 
	<input type="checkbox" name="${z.serviceName}" value="${z.serviceName}"> ${z.serviceName}<br>
			
	 --%>
	
	
	
	</form>
	
	
	
	
	
	
	
<br/>
	
</body>
</html>