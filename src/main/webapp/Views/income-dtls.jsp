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
		<h2>Income Details</h2>

		<form:form method="POST" action="submitincome" modelAttribute="income">
			<table>
				<tr>
					<th>CaseId:</th>
					<td>${caseId}</td>
				</tr>
				<tr>
				<th>Individuals Name</th>
				<td><form:input path="individName" ></form:input>
				</tr>
				<tr>
				
				<td>Is Working Employee:</td>
				<td>
					<form:radiobutton path="isWorking" value="YES"/> Yes
					<form:radiobutton path="isWorking" value="No"/> No
				</td>
			</tr>
			<tr>
				<th>Other Income $</th>
				<td><form:input path="otherIncome"></form:input>
				</td>
				</tr>
				
				<tr>
				<td>
				<input type="submit" value="submitincome"/></td>
				</tr>
			</table>

		</form:form>
	</div>
	
	
	
	
	
	
	
	
	

</body>
</html>
