<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Supprimer un student</title>
</head>
<body>

<h2> donne l'id du student à effacer</h2>

<form:form method="POST" action="resultatFormulaireStudent" modelAttribute="student">
        <form:label path="id">id du student à supprimer</form:label><br>
        <form:input path="id"/><br>
        
        <input type="submit" value="Valider"/>
</form:form>
</body>
</html>