<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

    <%@ include file="../layout/header.jsp" %>

        <!--회원정보수정6. JSP 만들기-->
        <div class="container mt-3">
            <form action="/users/${principal.userId}/edit" method="post">
                <h2>회원정보수정페이지</h2>
                <br />
                <div class="row">
                    <div class="col">
                        아이디: <input type="text" class="form-control" value="${userEdit.userName}" name="userName">
                    </div>
                    <div class="col">
                        비밀번호: <input type="password" class="form-control" value="${userEdit.userPassword}"
                            name="userPassword">
                    </div>
                    <div class="col">
                        이메일: <input type="text" class="form-control" value="${userEdit.userEmail}" name="userEmail">
                    </div>
                </div>
                <br />
                <button type="submit" class="btn btn-success">등록하기</button>
            </form>
        </div>

        <%@ include file="../layout/footer.jsp" %>