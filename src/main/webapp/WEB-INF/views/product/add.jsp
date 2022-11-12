<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container">
	<br />
	<form>
		<div class="row">
			<div class="col">
				상품명:<input id="productName" type="text" class="form-control"
					placeholder="상품명을 입력해주세요">
			</div>

			<div class="col">
				상품가격: <input id="productPrice" type="text" class="form-control"
					placeholder="상품가격을 입력해주세요">
			</div>
			<div class="col">
				상품수량: <input id="productQty" type="text" class="form-control"
					placeholder="상품수량을 입력해주세요">
			</div>
		</div>
		<br />
		<button id="btnProductNameSameCheck" type="button" class="btn btn-warning">상품명중복확인</button>
		<button id="btnAdd" type="button" class="btn btn-success">등록하기</button>
	</form>
</div>

<script src="/js/product.js"></script>
<%@ include file="../layout/footer.jsp"%>