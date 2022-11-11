<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<form action="/product/${productId}/edit" method="post">
		<h2>상품수정페이지</h2>
		<br />
		<div class="row">
			<div class="col">
				상품명: <input type="text" class="form-control"
					value="${edit.productName}" name="productName">
			</div>
			<div class="col">
				상품가격: <input type="text" class="form-control"
					value="${edit.productPrice}" name="productPrice">
			</div>
			<div class="col">
				상품수량: <input type="text" class="form-control"
					value="${edit.productQty}" name="productQty" >
			</div>
		</div>
		<br />
		<button type="submit" class="btn btn-success">등록하기</button>
	</form>
</div>

<%@ include file="../layout/footer.jsp"%>