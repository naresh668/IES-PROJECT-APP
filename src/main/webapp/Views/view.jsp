<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


<title>List of Empolyees</title>
</head>
<body>


<h2>List of Contacts</h2>
<script>
function deleteConfirm() {
    confirm("Press a button!?");
}
</script>
<a href="/">Back To Home Page</a>

<br>
<br>

<font color='green'>${delete}</font>

<table border="2" width="70%" cellpadding="2">  
	<tr>
		<th>Application No</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Date Of Birth</th>
		<th>SSN Num</th>
		<th>Action</th>
	</tr>
<c:forEach  items="${contactForm}" var="contact" >
<tr>

<td>${contact.userId}</td>
<td>${contact.firstName}</td>
<td>${contact.lastName}</td>	
<td>${contact.dateOfBirth}</td>
<td>${contact.ssnNum}</td>

<td>	<a href="/saveUser">Edit</a> &nbsp    <a href=""  onclick="return deleteConfirm();">Delete</a></td>

</tr>
</c:forEach>
</body>
</html>