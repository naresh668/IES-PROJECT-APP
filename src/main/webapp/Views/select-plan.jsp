<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%><!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div align="cemter">
		<h2>Select Plan</h2>

		<form:form method="POST" action="plansubmit" modelAttribute="plan">
			<table>
				<tr>
					<th>CaseId:</th>
					
					<td><form:input path="caseId" value="${caseNum}"/></td>
				</tr>
				<tr>
					<th>First Name:</th>
					<td><form:input path="firstName"></form:input>
				</tr>
				<tr>
					<th>Last Name:</th>
					<td><form:input path="lastName"></form:input>
				</tr>
				
				<tr>
				<th>select plan</th>
				<td>
				<form:select path="userPlan">
				<form:option value="">select</form:option>
				<form:option value="SSNP">SSNP</form:option>
				<form:option value="CCAP">CCAP</form:option>
				<form:option value="KENTUCKY WORKS">KENTUCKY WORKS</form:option>
				</form:select>
				</tr>
				
				<tr>
				<td>
				<input type="submit"  value="plansubmit"/></td>
				</tr>
			</table>

		</form:form>
	</div>
	
	
	
	
	
	
	
	
	

</body>
</html>
