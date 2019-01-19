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
<h1>Hello shivam you are in update Vendor Form</h1>

<s:form method="post" modelAttribute="updatevendor">
	<table>
			<tr>
				<td> Id :</td>
				<td><s:input path="vendor_id" readonly="true"/></td>
			</tr>
			<tr>
				<td> Name :</td>
				<td><s:input path="vendor_name"/></td>
			</tr>
			<tr>
				<td> Email :</td>
				<td><s:input path="vendor_email" readonly="true"/></td>
			</tr>
			<tr>
				<td> Password :</td>
				<td><s:input path="vendor_password"/></td>
			</tr>
			<tr>
				<td> Contact :</td>
				<td><s:input path="vendor_contact"/></td>
			</tr>
			<tr>
				<td> Company Name :</td>
				<td><s:input path="vendor_company_name"/></td>
			</tr>
			<tr>
				<td> AadharCard Number :</td>
				<td><s:input path="vendor_AadhaarCard" readonly="true"/></td>
			</tr>
			<tr>
				<td> Office Number :</td>
				<td><s:input path="vendor_office_number"/></td>
			</tr>
			
			<tr>
				<td>City :</td>
				<td><input type="text" name="vendor_city"> </td>
			</tr>
			
			
			<tr>
				<td>State :</td>
				<td><input type="text" name="vendor_state"> </td>
			</tr>
			
			<tr>
				<td>Street :</td>
				<td><input type="text" name="vendor_street"> </td>
			</tr>
			
			<tr>
				<td>Pincode :</td>
				<td><input type="text" name="vendor_pincode"> </td>
			</tr>
			
			<tr>
				<td> Company Type :</td>
				<td><s:input path="vendor_company_type"/></td>
			</tr>
			<tr>
				<td> </td>
				<td><input type="submit" value="Save and Next" /></td>
			</tr>
		</table>
</s:form>

</body>
</html>