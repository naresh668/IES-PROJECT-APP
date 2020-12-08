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
		
		

		<form:form method="GET" action="search" modelAttribute="data">


			<table>
				<tr>
					<th>APP Num:</th>
					<td><form:input path="userId" PlaceHolder="Enter app-num"></form:input>
					</td>
			<td><input type="submit" value="search"  /></td>	
		</tr>
	
					
				
		
		
		
			
				
					

			</table>
		</form:form>
	</div>


</body>
</html>