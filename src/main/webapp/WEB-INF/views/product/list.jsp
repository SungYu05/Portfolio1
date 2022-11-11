<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<h2>상품목록페이지</h2>
	<br />
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>상품이름</th>
				<th>상품가격</th>
				<th>상품수량</th>
				<th>등록일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${productList}">
				<tr>
					<td>${product.productName}</td>
					<td>${product.productPrice}</td>
					<td>${product.productQty}</td>
					<td>${product.createdAt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
		<button type="button" class="btn btn-success">상품추가</button>
</div>

<%@ include file="../layout/footer.jsp"%>