<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.circle {
	width: 60px;
	height: 60px;
	border-radius: 50%;
}

.imagebox {
	width: 80px;
	height: 80px;
	border: 1px solid grey;
}
</style>
</head>

<body>
	<%@include file="/WEB-INF/resources/components/alllinks.jsp"%>

	<div class="container mt-5">
		<div class="row  mb-5">
			<div class= " col-12 col-md-6 ">
				<div class="hover border">
					<img src="${product.images[0]}" alt=""
						style="height: 70vh; width: 100%" class="imgg" id="mainimg" />
				</div>
				<div class="d-flex justify-content-center mt-2">
					<div class="ms-2">
						<img src="${product.images[0]}" class="imagebox" />
					</div>
					<div class="ms-2">
						<img src="${product.images[1]}" class="imagebox" />
					</div>
					<div class="ms-2">
						<img src="${product.images[2]}" class="imagebox" />
					</div>
				</div>
			</div>
			<div class="col-12 col-md-6">
				<h3>${product.productBrand}</h3>
				<h5 class="text-secondary mt-1 mb-2 ">${product.productName}</h5>
				
				<c:set var="ratingss">
					<c:forEach begin="1" end="${ product.ratings }">
						<i class="fa fa-star mt-2 mb-1 fs-5 text-warning"></i>
					</c:forEach>
					<c:forEach begin="${ product.ratings + 1 }" end="5">
						<i class="fa fa-star mt-2  mb-1 fs-5"></i>
					</c:forEach>
				</c:set>
				${ratingss}
	             <hr>
	             <div class="d-flex">
	             	<p class="text-dark fs-5 fw-bold">&#8377;${product.discountPrice} </p>
				<p class="text-secondary fs-5 ms-3 ">MRP <s>&#8377;${product.price} </s></p>
				<span class="fs-5 ms-2 " style="color:rgb(255, 105, 180);">(${product.discount}% OFF)</span>
	             </div>
			<p class="text-success fs-6 fw-bold ms-1" style="margin: -8px" >inclusive of all taxes</p>
			
			
				<div class="row  mt-4">
					<div class="col-md-6 ">
					<div class="d-flex">
					<p class="text-dark fw-bold" style="font-size: 15px;">SELECT SIZE </p>
					<p class="fw-bold ms-3" style="color:rgb(255, 105, 180); font-size: 15px;">SIZES &#62;</p>
					</div>
						<div class="d-flex">
						<c:forEach items="${ product.sizes}" var="item">
							<div
								class="circle border border-secondary text-dark fw-bold  mt-1  ms-2 d-flex justify-content-center align-items-center ">${ item }</div>
						</c:forEach>
						</div>
					</div>
					<div class="mt-4">
						<button type="button" class="btn text-white p-2 fw-bold" style="background-color:rgb(255, 16, 240); width: 200px;"><i class="fa-solid fa-bag-shopping me-2"></i>Add to Bag</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script type="text/javascript">
    let imag = document.querySelectorAll('.imagebox');
    imag.forEach(item => {
        item.addEventListener('click', function() {
            document.getElementById("mainimg").src = this.src;
        });
    });
	
	</script>
</body>
</html>