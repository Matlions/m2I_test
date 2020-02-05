<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
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
<title>Student administrator</title>
<meta charset="ISO-8859-1">

</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="responsive-sm">
		<div class="banner"
			style="background-image: linear-gradient(rgba(0, 0, 0, 0.4), rgba(0, 0, 0, 0.4)), url(https://images.unsplash.com/photo-1552652893-2aa10a0ab4df?ixlib=rb-1.2.1&amp;ixid=eyJhcHBfaWQiOjEyMDd9&amp;auto=format&amp;fit=crop&amp;w=1350&amp;q=80);">


			<div class="container ">
				<div class="row mt-24 mb-8 justify-content-center" id=row1Accueil>
					<h1>
						Student Administrator <strong>a good tool</strong> for <strong>you</strong>!
					</h1>
				</div>

				<div class="row mt-24 mb-8 justify-content-center" id=row2Accueil>
					<p>Make your choice</p>
				</div>

				<div class="row mt-24 mb-8 justify-content-center" id=row3Accueil>

					<a class="btn btn-outline-success" id="btformulaire"
						href="student/formulaireStudent">formulaire student</a> 
						
					<a class="btn btn-outline-success" id="btliste"
						href="student/afficherListeStudents">liste des students</a>
						
					<a class="btn btn-outline-success" id="btsupprimer"
						href="student/afficherListeStudents">supprimer 1 student</a>

				</div>


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
</html>