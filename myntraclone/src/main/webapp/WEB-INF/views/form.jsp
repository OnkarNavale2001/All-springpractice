
<%@include file="/WEB-INF/resources/components/alllinks.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@include file="/WEB-INF/resources/components/alllinks.jsp" %>

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-lg-6">
            <div class="card">
                <div class="card-body">
                    <h4 class="card-title text-center mb-4">Add product</h4>
                    <form action="add" method="post">
                        <div class="mb-2">
                            <input type="text" class="form-control form-label" name="productName" placeholder="Product Name" />
                        </div>
                        <div class="mb-2">
                            <input type="number" class="form-control form-label" name="price" placeholder="Price" />
                        </div>
                        <div class="mb-2">
                            <input type="number" class="form-control form-label" name="ratings" placeholder="Ratings" />
                        </div>
                        <div class="mb-2">
                            <input type="url" class="form-control form-label" name="images"  placeholder="Image URL 1" />
                        </div>
                        <div class="mb-2">
                            <input type="url" class="form-control form-label" name="images"  placeholder="Image URL 2" />
                        </div>
                        <div class="mb-2">
                            <input type="url" class="form-control form-label" name="images"  placeholder="Image URL 3" />
                        </div>
                        <div class="mb-2">
                            <select class="form-select form-label" name="productCategory">
                                <option selected>Select Category</option>
                                <option value="Men">Men</option>
                                <option value="Women">Women</option>
                                <option value="Kids">Kids</option>
                                <option value="Beauty">Beauty</option>
                            </select>
                        </div>
                        <div class="mb-2 d-flex">
                            <div class="">
                                <input class="form-check-input" type="checkbox" name="sizes" value="XS" id="sizeXS" />
                                <label class="form-check-label" for="sizeXS">XS</label>
                            </div>
                            <div class="ms-2">
                                <input class="form-check-input" type="checkbox" name="sizes" value="S" id="sizeS" />
                                <label class="form-check-label" for="sizeS">S</label>
                            </div>
                            <div class="ms-2">
                                <input class="form-check-input" type="checkbox" name="sizes" value="M" id="sizeM" />
                                <label class="form-check-label" for="sizeM">M</label>
                            </div>
                            <div class="ms-2">
                                <input class="form-check-input" type="checkbox" name="sizes" value="L" id="sizeL" />
                                <label class="form-check-label" for="sizeL">L</label>
                            </div>
                            <div class="ms-2">
                                <input class="form-check-input" type="checkbox" name="sizes" value="XL" id="sizeXL" />
                                <label class="form-check-label" for="sizeXL">XL</label>
                            </div>
                        </div>
                        <div class="mb-2">
                            <input type="number" class="form-control form-label" name="discountPrice" placeholder="Discount Price" />
                        </div>
                        <div class="mb-2">
                            <input type="text" class="form-control form-label" name="productBrand" placeholder="Product Brand" />
                        </div>
                        <div class="mb-2">
                            <input type="text" class="form-control form-label" name="discount" placeholder="Discount" />
                        </div>
                        <button type="submit" class="btn btn-success fw-bold w-100 btn-block">
                            Submit
                        </button>
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

</body>
</html>
    