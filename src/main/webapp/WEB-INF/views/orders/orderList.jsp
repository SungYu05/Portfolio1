<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ include file="../layout/header.jsp" %>
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
							<td>
								<form action="/orders/${orderList.ordersId}/delete" method="post">
									<input type="hidden" name="orderName" value="${orderList.orderName}">
									<input type="hidden" name="orderPrice" value="${orderList.orderPrice}">
									<input type="hidden" name="orderQty" value="${orderList.orderQty}">
									<input type="hidden" name="productId" value="${orderList.productId}">
									<input type="hidden" name="userId" value="${orderList.userId}">
									<button type="submit" class="btn btn-danger">구매취소하기</button>
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<%@ include file="../layout/footer.jsp" %>