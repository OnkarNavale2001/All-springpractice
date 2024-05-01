<%@include file="/WEB-INF/resources/components/alllinks.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Product</title>
</head>
<body>
<%@include file="/WEB-INF/resources/components/alllinks.jsp" %>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-lg-6">
            <div class="card">
                <div class="card-body">
                    <h4 class="card-title text-center mb-4">Update Product</h4>
                    <form action="update" method="post">
                        <input type="hidden" class="form-control form-label" name="id" placeholder="Product Name" value="${product.id}" />
                    
                        <div class="mb-2">
                            <input type="text" class="form-control form-label" name="productName" placeholder="Product Name" value="${product.productName}" />
                        </div>
                        <div class="mb-2">
                            <input type="number" class="form-control form-label" name="price" placeholder="Price" value="${product.price}" />
                        </div>
                        <div class="mb-2">
                            <input type="number" class="form-control form-label" name="ratings" placeholder="Ratings" value="${product.ratings}" />
                        </div>
                        <div class="mb-2">
                            <input type="url" class="form-control form-label" name="images" placeholder="Image URL 1" value="${product.images[0]}" />
                        </div>
                        <div class="mb-2">
                            <input type="url" class="form-control form-label" name="images" placeholder="Image URL 2" value="${product.images[1]}" />
                        </div>
                        <div class="mb-2">
                            <input type="url" class="form-control form-label" name="images" placeholder="Image URL 3" value="${product.images[2]}" />
                        </div>
                        <div class="mb-2">
                            <select class="form-select form-label" name="productCategory">
                                <option selected>Select Category</option>
                                <option value="Men" ${product.productCategory == 'Men' ? 'selected' : ''}>Men</option>
                                <option value="Women" ${product.productCategory == 'Women' ? 'selected' : ''}>Women</option>
                                <option value="Kids" ${product.productCategory == 'Kids' ? 'selected' : ''}>Kids</option>
                                <option value="Beauty" ${product.productCategory == 'Beauty' ? 'selected' : ''}>Beauty</option>
                            </select>
                        </div>
                        <div class="mb-2 d-flex">
                            <!-- Assume product.sizes is an array of selected sizes -->
                            <c:forEach var="size" items="${product.sizes}">
                                <div class="ms-2">
                                    <input class="form-check-input" type="checkbox" name="sizes" value="${size}" id="size${size}" checked />
                                    <label class="form-check-label" for="size${size}">${size}</label>
                                </div>
                            </c:forEach>
                        </div>
                        <div class="mb-2">
                            <input type="number" class="form-control form-label" name="discountPrice" placeholder="Discount Price" value="${product.discountPrice}" />
                        </div>
                        <div class="mb-2">
                            <input type="text" class="form-control form-label" name="productBrand" placeholder="Product Brand" value="${product.productBrand}" />
                        </div>
                        <div class="mb-2">
                            <input type="text" class="form-control form-label" name="discount" placeholder="Discount" value="${product.discount}" />
                        </div>
                        <button type="submit" class="btn btn-success fw-bold w-100 btn-block">
                            Update
                        </button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
