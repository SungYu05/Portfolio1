<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container mt-3">
	<form action="/join" method="post">
		<div class="mb-3 mt-3">
			userName: <input type="text" class="form-control"
				placeholder="userName을 입력해주세요" name="userName">
		</div>
		<div class="mb-3">
			userPassword: <input type="password" class="form-control"
				placeholder="userPassword을 입력해주세요" name="userPassword">
		</div>
		<div class="mb-3">
			userEmail: <input type="email" class="form-control"
				placeholder="userEmail을 입력해주세요" name="userEmail">
		</div>
		<button type="button"
			class="btn btn-warning">상품명중복확인</button>
		<button type="submit" class="btn btn-success">회원가입하기</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>