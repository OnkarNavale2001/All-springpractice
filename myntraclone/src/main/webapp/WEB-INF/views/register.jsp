<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%@include file="/WEB-INF/resources/components/alllinks.jsp"%>

	<div class="container-fluid">

		<div
			class="container vh-100 d-flex justify-content-center align-items-center">
			<div class="card shadow p-3  bg-body rounded" style="width: 600px;">
				<h5 class="card-title text-center mb-0">Registration</h5>
				<c:if test="${not empty succ}">
					<h4 class="text-center text-success">${succ}</h4>
					<c:remove var="succ" />
				</c:if>
				<div class="card-body">
					<form action="registerdetails" method="post">
						<div class="mb-2">
							<label for="name" class="form-label"></label> <input type="text"
								class="form-control" name="name" placeholder="Enter your name"
								required oninput="checkFields()">
						</div>
						<div class="mb-2">
							<label for="email" class="form-label"></label> <input
								type="email" class="form-control" name="email"
								placeholder="Enter your email" required oninput="checkFields()">
						</div>
						<div class="mb-2">
							<label for="password" class="form-label"></label> <input
								type="password" class="form-control" name="password"
								placeholder="Enter your password" required
								oninput="checkFields()">
						</div>
						<div class="mb-2">
							<label for="phone" class="form-label"></label> <input type="text"
								class="form-control" name="phone"
								placeholder="Enter your phone number" required
								oninput="checkFields()">
						</div>
						<div class="d-grid">
							<button type="submit" class="btn btn-lg"
								style="background-color: #ff4d94" id="submitButton">Register</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>