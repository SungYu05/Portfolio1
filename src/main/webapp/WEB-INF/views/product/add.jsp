<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<br />
	<form action="/product/add" method="post">
		<div class="row">
			<div class="col">
				상품명: <input type="text" class="form-control"
					placeholder="상품명을 입력해주세요" name="productName">
			</div>
			<div class="col">
				상품가격: <input type="text" class="form-control"
					placeholder="상품가격을 입력해주세요" name="productPrice">
			</div>
			<div class="col">
				상품수량: <input type="text" class="form-control"
					placeholder="상품수량을 입력해주세요" name="productQty">
			</div>
		</div>
		<br />
		<button type="submit" class="btn btn-success">등록하기</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>