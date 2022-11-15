<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/header.jsp"%>
<div class="container mt-3">
	<h2>구매목록페이지</h2>
	<br />
	<table class="table table-bordered">

		<thead>
			<tr>
				<th>상품이름</th>
				<th>상품가격</th>
				<th>구매수량</th>
				<th>구매일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="orderList" items="${orderList}">
				<tr>
					<td>${orderList.orderName}</td>
					<td>${orderList.orderPrice}</td>
					<td>${orderList.orderQty}</td>
					<td>${orderList.createdAt}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
<%@ include file="../layout/footer.jsp"%>