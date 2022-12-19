<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ include file="../layout/header.jsp" %>
		<!-- 1. 관리자 전용 상세페이지 만들기 -->
		<div class="container mt-3">
			<h2>상품상세페이지</h2>
			<br />
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>상품이름</th>
						<th>상품가격</th>
						<th>상품수량</th>
						<th>등록일</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>${product.productName}</td>
						<td>${product.productPrice}</td>
						<td>${product.productQty}</td>
						<td>${product.createdAt}</td>
						<td><button type="button" class="btn btn-warning"
								onclick="location.href='/product/'+'${product.productId}'+'/edit'">수정하기</button></td>
						<td>
							<form action="/product/${product.productId}/delete" method="post">
								<button type="submit" class="btn btn-danger">삭제하기</button>
							</form>
						</td>
					</tr>
				</tbody>
			</table>
		</div>

		<%@ include file="../layout/footer.jsp" %>