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
	<h1>Welcome To Vendor Registration form</h1>
	
	<s:form method="post" modelAttribute="Vendor">
		<table>
			<tr>
				<td>Vendor Name:</td>
				<td><s:input path="vendor_name"/></td>
			</tr>
			<tr>
				<td>Vendor Email:</td>
				<td><s:input path="vendor_email"/></td>
			</tr>
			<tr>
				<td>Vendor Password:</td>
				<td><s:input path="vendor_password"/></td>
			</tr>
			<tr>
				<td>Vendor Contact:</td>
				<td><s:input path="vendor_contact"/></td>
			</tr>
			<tr>
				<td>Vendor Company Name:</td>
				<td><s:input path="vendor_company_name"/></td>
			</tr>
			<tr>
				<td>Vendor AadhaarCard:</td>
				<td><s:input path="vendor_AadhaarCard"/></td>
			</tr>
			<tr>
				<td>Vendor Office Number:</td>
				<td><s:input path="vendor_office_number"/></td>
			</tr>
			<tr>
				<td>Company type:</td>
				<td><s:radiobutton path="vendor_company_type" value="local"/>Local </td>
				<td><s:radiobutton path="vendor_company_type" value="showroom"/>Showroom </td>		
			</tr>
			<tr>
				<td>Status:</td>
				<td><s:input path="status"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Update Service" /></td>
			</tr>
			
		</table>
	</s:form>
	
</body>
</html>