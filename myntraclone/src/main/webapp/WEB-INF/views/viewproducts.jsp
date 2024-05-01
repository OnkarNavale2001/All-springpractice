<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
<%@include file="/WEB-INF/resources/components/alllinks.jsp" %>
<table class="table table-striped mt-3 table-bordered">
    <thead>
        <tr>
            <th>Product Name</th>
            <th>Price</th>
            <th>Ratings</th>
            <th>Sizes</th>
            <th>Images</th>
            <th>Category</th>
            <th>Discount Price</th>
            <th>Product Brand</th>
            <th>Discount</th>
            <th>Update</th>
            <th>Delete</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${products}" var="product">
            <tr>
                <td>${product.productName}</td>
                <td>${product.price}</td>
                <td>${product.ratings}</td>
                <td> <c:forEach items="${product.sizes}" var="sizes">
                ${sizes}
                
                
                </c:forEach> </td>
                <td>
                  <img alt="" width="80px" height="80px" src=" ${product.images[0]}">
                </td> 
                <td>${product.productCategory}</td>
                <td>${product.discountPrice}</td>
                <td>${product.productBrand}</td>
                <td>${product.discount}</td>
                <td><a href="updateproduct?id=${product.id}"><i class="fa-solid fa-pencil fs-4"></i></a></td>
                <td><a href="deleteproduct?id=${product.id}"><i class="fa-solid fa-trash-can text-danger fs-4"></i></a></td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
