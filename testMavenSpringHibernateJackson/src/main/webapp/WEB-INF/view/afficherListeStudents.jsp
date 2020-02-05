<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 
<%@ page import="java.util.List"  %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>afffiche liste students</title>
</head>
<body>
<%@ include file="header.jsp"%>
<div class="table-responsive-sm">
	
	<table class="table mt-5 mr-10 ml-10 margeTable">
		<thead class="thead-dark">
			<tr>
				<th scope="col">ID</th>
				<th scope="col">First Name</th>
				<th scope="col">Last Name</th>
				<th scope="col">Email</th>
				<th scope="col">Address</th>
				<th scope="col">delete</th>
                <th scope="col">update</th>
			</tr>
		</thead>	
		<tbody>
		  <c:forEach var="student" items="${listStudents}">
			<tr class="bg-success">
			 <td><c:out value="${student.id}" /></td>
                    <td><c:out value="${student.prenom}" /></td>
                    <td><c:out value="${student.nom}" /></td>
                    <td><c:out value="${student.email}" /></td>
                    <td><c:out value="${student.address}" /></td>
				  	<td>
                    <!-- a href="<c:url var ="supprimerUnStudent" value ="/supprimerUnStudent/${student.id}"/>">Supp</a> -->
                   	<form action="delete"  method="POST">
                    <input id="student" name="student" type="hidden" value="${student.id}">
                    <input type="submit" value="delete" onClick="return confirm('sure?')"/>
                    </form> 
                    </td>
                    
                    <td>
                    <form  action="update" method="POST">
                    <input id="student" name="student" type="hidden" value="${student.id}">
                    <input type="submit" value="update"/>
				    </form>
                    </td>
			</tr>
		  </c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>