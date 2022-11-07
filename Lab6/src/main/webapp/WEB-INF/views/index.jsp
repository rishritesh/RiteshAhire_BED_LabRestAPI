<html>
<head>

 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@page isELIgnored="false" %> 
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">




<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />



<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
 
</head>
<body>
<div class="container mt-3">
	<div class="row">
		<div class="col-md-12">
		
		
		<h1 class="text-center mb-3">Welcome To student  Details</h1> 
			<table class="table">
				<thead class="thead-dark">
					<tr>
						<th scope="col">Student Id</th>
						<th scope="col">FirstName</th>
						<th scope="col">LastName</th>
						<th scope="col">Course</th>
						<th scope="col">Country</th>
						<th scope="col">Action</th>
						
					</tr>
				</thead>
				<tbody>
				<c:forEach items="${student}" var="s" >
					<tr>
						<th scope="row">${s.id}</th>
						<td>${s.firstname}</td>
						<td>${s.lastname}</td>
						<td >${s.course}</td>
						<td >${s.country}</td>
						<td>
						<a href="delete/${s.id }">Delete</a>
						|
						<a href="update/${s.id }">Update</a>
						</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<hr>
			<div class="container text-center">
			<a href="${pageContext.request.contextPath}/add" class="btn btn-outline-success">Add</a>
			</div>
		</div>
	</div>
</div>
</body>
</html>
