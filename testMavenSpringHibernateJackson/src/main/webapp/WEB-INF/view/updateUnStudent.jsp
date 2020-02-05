<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update a Student</title>
</head>
<body>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>Update your student</caption>
			<tr>
				<th>writte student id</th>
			</tr>
		</table>

		<form:form method="POST" action="resultatUpdateUnStudent"
			modelAttribute="student">
			<form:label path="id">id</form:label>
			<br>
			<form:input path="id" />
			<br>
			<input type="submit" value="Valider" />
		</form:form>

	</div>


</body>
</html>