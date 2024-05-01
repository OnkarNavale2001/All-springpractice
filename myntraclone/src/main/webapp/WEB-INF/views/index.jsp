<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.image {
	width: 15rem;
	height: 230px;
}

.card {
	border: none;
}

.card:hover {
	transition: 0.5s all;
	box-shadow: 1px 0px 5px 2px rgba(221, 221, 221, 0.75);
}

.cursor {
	cursor: pointer;
}

.fontsize {
	font-size: 12px;
	color: rgb(255, 105, 180);
}
</style>
<body>
	<%@include file="/WEB-INF/resources/components/alllinks.jsp"%>
	<div class="container-fluid mt-1">
		<div id="carouselExampleCaptions" class="carousel slide"
			data-bs-ride="carousel" style="height: 600px">
			<div class="carousel-indicators">
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="0" class="active" aria-current="true"
					aria-label="Slide 1"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="1" aria-label="Slide 2"></button>
				<button type="button" data-bs-target="#carouselExampleCaptions"
					data-bs-slide-to="2" aria-label="Slide 3"></button>
			</div>
			<div class="carousel-inner">
				<div class="carousel-item active">
					<img src="https://i.ibb.co/Zmw2MKp/img.jpg" class="d-block w-100"
						style="height: 600px" />
				</div>
				<div class="carousel-item">
					<img src="https://i.ibb.co/wd8kyJk/img1.jpg" class="d-block w-100"
						style="height: 600px" alt="..." />
				</div>
				<div class="carousel-item">
					<img src="https://i.ibb.co/gWK10yn/img4.jpg" class="d-block w-100"
						style="height: 600px" alt="..." />
				</div>
			</div>
		</div>
	</div>

	<div class="container-fluid ">
		<div
			class="row mt-2 row-cols-1 ms-2 row-cols-sm-2 row-cols-md-3 row-cols-lg-4">
			<c:forEach var="product" items="${products}">
				<a class="text-decoration-none active"
					href="viewfullproduct?id=${product.id}">
					<div class="col mb-4">
						<div class="mt-5">
							<div class="card border-1 cursor"
								style="width: 15rem; height: 23rem;">
								<img src="${product.images[0]}" class="card-img-top image"  >
								<div class="card-body">
									<span class="fw-bold text-dark fs-6">${product.productBrand}</span>
									<p class="text-secondary fontsize">${product.productName}</p>
									<c:set var="ratingss">
										<c:forEach begin="1" end="${product.ratings}">
											<i class="fa fa-star text-warning"></i>
										</c:forEach>
										<c:forEach begin="${product.ratings+1}" end="5">
											<i class="fa fa-star text-dark "></i>
										</c:forEach>
									</c:set>
									<span style="font-size: 10px; position: relative; top: -19px;">${ratingss}</span>
									<p class="fs-6 text-dark"
										style="font-size: 10px; position: relative; top: -19px;">
										Rs <span class="fw-bold text-dark">${product.discountPrice}</span> <span
											class="text-secondary ms-1" style="font-size: 12px;">
											<del>&#8377;${product.price} </del>
										</span> <span class="fontsize ms-1 ">(${product.discount}% OFF)</span>

									</p>
								</div>
							</div>
						</div>
					</div>
				</a>
			</c:forEach>
		</div>
	</div>
		<div class="container-fluid ">
		<div
			class="row mt-2 row-cols-1 ms-2 row-cols-sm-2 row-cols-md-3 row-cols-lg-4">
			<c:forEach var="product" items="${product}">
				<a class="text-decoration-none active"
					href="viewfullproduct?id=${product.id}
                                ">
					<div class="col mb-4">
						<div class="mt-5">
							<div class="card border-1 cursor"
								style="width: 15rem; height: 24rem;">
								<img src="${product.images[1]}" class="card-img-top image">
								<div class="card-body">
									<span class="fw-bold text-dark fs-6">${product.productBrand}</span>
									<p class="text-secondary fontsize">${product.productName}</p>
									<c:set var="ratingss">
										<c:forEach begin="1" end="${product.ratings}">
											<i class="fa fa-star text-warning"></i>
										</c:forEach>
										<c:forEach begin="${product.ratings+1}" end="5">
											<i class="fa fa-star text-dark "></i>
										</c:forEach>
									</c:set>
									<span style="font-size: 10px; position: relative; top: -19px;">${ratingss}</span>
									<p class="fs-6 text-dark"
										style="font-size: 10px; position: relative; top: -19px;">
										Rs <span class="fw-bold text-dark"> ${product.discountPrice}</span> <span
											class="text-secondary ms-1" style="font-size: 12px;">
											<del>&#8377;${product.price} </del>
										</span> <span class="fontsize ms-1 ">(${product.discount}% OFF)</span>

									</p>
								</div>
							</div>
						</div>
					</div>
				</a>
			</c:forEach>
		</div>
	</div>
	
</body>
</html>