<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<h2>Register Form</h2>
	<form:form method="POST" action="save" modelAttribute="admin">
		<div>

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
					<th>email:</th>
					<td><form:input path="email" PlaceHolder="Email"></form:input>
					</td>
				</tr>


				<tr>
					<th>Password:</th>
					<td><form:input path="Password"
							PlaceHolder="enter your password"></form:input></td>
				</tr>
				<tr>
					<th>DateOfBirth:</th>
					<td><form:input path="dob" PlaceHolder="Date of birth"></form:input>
					</td>
				</tr>
				<tr>
					<th>email:</th>
					<td><form:input path="email" PlaceHolder="Email"></form:input>
					</td>
				</tr>
				<tr>
					<th>Gender:</th>
					<td>Male <form:radiobutton path="Gender" value="Male" />
						Female <form:radiobutton path="Gender" value="Female" />
					</td>
				</tr>
				<tr>
					<th>SsnNum:</th>
					<td><form:input path="text" PlaceHolder="SSN-Num"></form:input>
					</td>
				</tr>
				<tr>
					<th>PhoneNumber:</th>
					<td><form:input path="text" PlaceHolder="Mobile-Number"></form:input>
					</td>
				</tr>








			</table>
		</div>
</body>




</form:form>
</html>