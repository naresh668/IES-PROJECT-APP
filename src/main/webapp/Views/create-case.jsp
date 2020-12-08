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

		<form:form method="POST" action="createcase" modelAttribute="appNum">
			<table>
				<tr>
					<th>AppNum:</th>
					<td>${appNum.userId}</td>
				</tr>
				<tr>
					<th>FirstName:</th>
					<td>${appNum.firstName}</td>
				</tr>
				<tr>
					<th>DateOfBirth:</th>
					<td>${appNum.dateOfBirth}</td>
				</tr>
				<tr>
					<th>Gender:</th>
					<td>${appNum.gender}</td>
				</tr>
				<tr>
					<th>Ssn-Num:</th>
					<td>${appNum.ssnNum}</td>
				</tr>
				<tr>
					<th>PhoneNum:</th>
					<td>${appNum.phoneNum}</td>
				</tr>
				<tr>
					<th>Email:</th>
					<td>${appNum.email}</td>
				</tr>
				<tr>
					<td><input type="submit" value="createcase" /></td>
				</tr>
				
			</table>

		</form:form>
	</div>

</body>
</html>