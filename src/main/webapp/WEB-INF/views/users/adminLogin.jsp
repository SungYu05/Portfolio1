<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="../layout/header.jsp"%>
<div class="container mt-3">
	<form action="/admin/login" method="post">
		<div class="mb-3 mt-3">
			아이디: <input type="text" class="form-control" id="email"
				placeholder="아이디를 입력해주세요" name="userName">
		</div>
		<div class="mb-3">
			비밀번호: <input type="password" class="form-control" id="pwd"
				placeholder="비밀번호를 입력해주세요" name="userPassword">
		</div>

		<button type="submit" class="btn btn-success">로그인하기</button>
		<button type="button" class="btn btn-primary"
			onclick="location.href='join'">회원가입</button>
	</form>
</div>
<%@ include file="../layout/footer.jsp"%>