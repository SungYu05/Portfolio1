<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ include file="../layout/header.jsp" %>
		<!--유저전체주문목록5. JSP 만들기-->
		<div class="container mt-3">
			<h2>구매목록페이지</h2>
			<br />
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>아이디</th>
						<th>상품이름</th>
						<th>상품가격</th>
						<th>구매수량</th>
						<th>구매일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="list" items="${userOrderFindAll}">
						<tr>
							<td>${list.userName}</td>
							<td>${list.orderName}</td>
							<td>${list.orderPrice}</td>
							<td>${list.orderQty}</td>
							<td>${list.createdAt}</td>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<%@ include file="../layout/footer.jsp" %>