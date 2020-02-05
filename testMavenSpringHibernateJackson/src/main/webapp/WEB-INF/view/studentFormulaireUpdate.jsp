<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">



<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/ressources/css/style.css" />
<title>Student Formulaire Update</title>
</head>
<body>
	<%@ include file="header.jsp"%>

	<div class="container-fluid">


		<form:form method="POST" action="updateFormulaireStudent"
			modelAttribute="create">
			<form:label path="prenom">prenom</form:label>
			<br>
			<form:input path="prenom" />
			<br>

			<form:input path="id" type="hidden" />

			<form:label path="nom">nom</form:label>
			<br>
			<form:input path="nom" />
			<br>



			<form:label path="email">email</form:label>
			<br>
			<form:input path="email" />
			<br>


			<form:label path="address">address</form:label>
			<br>
			<form:input path="address" />
			<br>



			<!-- input type="submit" value="Valider" /> -->
		</form:form>


		<div class="row mt-6">
			<div class="col-xs-12 col-sm-12 col-md-12 col-lg-12 text-center">
				<h2 class="font-weight-bold mt-16">Contact</h2>
			</div>
		</div>
		<div class="row justify-content-center align-items-center">
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6 col-xs-offset-3">
				<form:form method="POST" action="updateFormulaireStudent"
					modelAttribute="create">
					<form id="contact-form" class="form justify-content-center"
						 method="POST" role="form">

						<div class="form-group">
							<label class="form-label" for="prenom" path="prenom">Your
								First Name</label> <input type="text" class="form-control" path="prenom"
								id="prenom" name="prenom" placeholder="Your first name"
								tabindex="1" required>
							<form:errors path="prenom" cssClass="error" />
						</div>

						<form:input path="id" type="hidden" />



						<div class="form-group">
							<label class="form-label" for="nom" path="nom">Your Name</label>
							<input type="text" class="form-control" id="nom" name="nom"
								placeholder="Your name" tabindex="2" required>
							<form:errors path="nom" cssClass="error" />
						</div>


						<div class="form-group">
							<label class="form-label" for="email" path="email">Your
								Email</label> <input type="email" class="form-control" id="email"
								name="email" placeholder="Your Email" tabindex="3" required>
							<form:errors path="email" cssClass="error" />
						</div>

						<div class="form-group">
							<label class="form-label" for="address" path="address">Your
								Address</label> <input type="text" class="form-control" id="address"
								name="address" placeholder="Your address" tabindex="4" required>
							<form:errors path="address" cssClass="error" />
						</div>
						<div class="text-center">
							<button type="submit" id="btnStfVal" class="btn btn-start-order"
								value="Valider">Validate</button>
						</div>
					</form>
				</form:form>
			</div>
		</div>
	</div>




	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>



</body>