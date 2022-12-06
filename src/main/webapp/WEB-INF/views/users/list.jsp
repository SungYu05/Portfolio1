<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

	<%@ include file="../layout/header.jsp" %>
		<div class="container mt-3">
			<!-- 2-3. 보여줄 것들을 jsp에 넣기-->
			<h2>유저목록페이지</h2>
			<br />
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>이름</th>
						<th>이메일</th>
						<th>등급</th>
						<th>등록일</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="user" items="${userList}">
						<tr>
							<td>${user.userName}</td>
							<td>${user.userEmail}</td>
							<td>${user.role}</td>
							<td>${user.createdAt}</td>
							<td>
								<form action="/users/orders/${user.userId}/list" method="get">
									<button type="submit" class="btn btn-success">구매내역목록보기</button>
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>

		<%@ include file="../layout/footer.jsp" %>