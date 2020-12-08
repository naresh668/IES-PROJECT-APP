<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<style>
  
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>




	<div align="center">
		<h3>Register Here</h3>
		<font color='green'>${succMsg}</font>
		<font color='green'>${failMsg}</font>
		
		

		<form:form method="POST" action="saveUser" modelAttribute="applicant">


			<table>
				<tr>
					<th>FirstName:</th>
					<td><form:input path="firstName" PlaceHolder="first name"></form:input>
					</td>
				</tr>
				<tr>
					<th>LastName:</th>
					<td><form:input path="lastName" PlaceHolder="last name"></form:input>
					</td>
				</tr>



				<tr>
					<th>DateOfBirth:</th>
					<td><form:input path="dateOfBirth" PlaceHolder="Date of birth"></form:input>
					</td>
				</tr>
				<tr>
					<td> Gender:</td>
					<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
							path="gender" value="F" />Female</td>

				</tr>
				<tr>
					<th>SsnNum:</th>
					<td><form:input path="ssnNum" PlaceHolder="SSN-Num"></form:input>
					</td>
				</tr>
				<tr>
					<th>PhoneNum:</th>
					<td><form:input path="phoneNum" PlaceHolder="Mobile-Number"></form:input>
					</td>
				</tr>


				<tr>
					<th>Email:</th>
					<td><form:input path="email" PlaceHolder="Email"></form:input>
					</td>
				</tr>

				<tr>
					<td><input type="reset" value="Reset" /></td>
					<td><input type="submit" value="saveUser" id="submitBtn" /></td>
				</tr>

			</table>
		</form:form>
	</div>


</body>
</html>