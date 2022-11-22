<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
				<th>상품상세보기</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="product" items="${productList}">
				<tr>
					<td>${product.productName}</td>
					<td>${product.productPrice}</td>
					<td>${product.productQty}</td>
					<td>${product.createdAt}</td>
					<!--  2. 조건문을 사용해서 관리자 전용 상세페이지와 유저 전용 상세페이지 나누기 -->
					<c:choose>
						<c:when test="${principal.role == 'user'}">
							<td><button type="submit" class="btn btn-light"
									onclick="location.href='/product/'+${product.productId}">상품상세보기</button></td>
						</c:when>
						<c:otherwise>
							<td><button type="submit" class="btn btn-light"
									onclick="location.href='/admin/product/'+${product.productId}">상품상세보기</button></td>
						</c:otherwise>
					</c:choose>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%@ include file="../layout/footer.jsp"%>