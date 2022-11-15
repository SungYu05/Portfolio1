<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>

<div class="container mt-3">
	<form action="/orders/${product.productId}" method="post" accept-charset="UTF-8">
		<input type="hidden" name="orderName" value=" ${product.productName}" /> 
		<input type="hidden"
			name="orderPrice" value=" ${product.productPrice}" />
					<input type="hidden"
			name="productQty" value=" ${product.productQty}" />
		<h2>상품상세페이지</h2>
		<br />
		<table class="table table-bordered">
			<thead>
				<tr>
					<th>상품이름</th>
					<th>상품가격</th>
					<th>상품수량</th>
					<th>등록일</th>
					<th>구매수량</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${product.productName}</td>
					<td>${product.productPrice}</td>
					<td>${product.productQty}</td>
					<td>${product.createdAt}</td>
					<td width="200"><input type="hidden" value="${product.productId}" />
					<input type="number" name="orderQty"></td>
					<!-- <td><button type="button" class="btn btn-warning"
							onclick="location.href='/product/'+${productId}+'/edit'">수정하기</button></td> -->
				</tr>
			</tbody>
		</table>
		<button type="submit" class="btn btn-success">구매하기</button>
	</form>
	<!-- <form action="/product/${productId}/delete" method="post">
				<button type="submit" class="btn btn-danger">삭제하기</button>
			</form> -->
</div>

<%@ include file="../layout/footer.jsp"%>