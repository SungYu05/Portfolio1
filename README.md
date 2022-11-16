# 연습문제 MyBatis

### 1. View 생성
- 상품등록 페이지
- 상품목록 페이지 (html table 사용)
- 상품상세보기 페이지 (삭제, 수정)
- 상품수정 페이지

- 회원가입 페이지
- 로그인 페이지
- 상품상세보기 페이지 (구매하기버튼)
- 구매목록 페이지

### 2. 기능 (ajax 필요 없음) (서비스 만들 필요 없음)
- 상품 등록(post - form태그)  주소 : /product/add
- 상품 목록보기(get) 주소 : /product
- 상품 상세보기(get) 주소 : /product/{id}
- 상품 삭제하기(post - form태그) : /product/{id}/delete
- 상품 수정하기(post - form태그) : /product/{id}/edit

- 회원가입(post - form태그) 주소: /join
- 로그인(post -  form태그) 주소: /login
- 상품상세보기 및 구매하기(post - form태그) 주소: /orders/{productId}
- 구매 후 상품 재고 수정
- 구매목록 보기(get) 주소: /orders/list

## 3. 고급 기능
- 상품 등록시 동일한 상품명 못들어가게 하기 (Ajax)

### 4. 테이블 생성
```sql
create table product(
    product_id int primary KEY auto_increment,
    product_name varchar(20) NOT null,
    product_price INT NOT null,
    product_qty INT NOT null,
    created_at TIMESTAMP NOT null
);

CREATE TABLE users(
	user_id INT PRIMARY KEY AUTO_INCREMENT,
	user_name VARCHAR(20) NOT NULL,
	user_password VARCHAR(20) NOT NULL,
	user_email VARCHAR(20) NOT NULL,
   created_at TIMESTAMP NOT null
);

CREATE TABLE orders(
    orders_id int primary KEY auto_increment,
    order_name varchar(20) NOT NULL,
    order_price int NOT NULL,
    order_qty int NOT NULL,
    product_id int NOT NULL,
    user_id int NOT NULL,
    created_at TIMESTAMP NOT NULL
);
```

### 5. 더미데이터
```sql
INSERT INTO product(product_name, product_price, product_qty, created_at) 
VALUES('바나나', 3000, 98, NOW());
INSERT INTO product(product_name, product_price, product_qty, created_at) 
VALUES('딸기', 2000, 100, NOW());

INSERT INTO users(user_name, user_password, user_email, created_at) 
VALUES ('ssar', '1234', 'ssar@nate.com', NOW());
INSERT INTO users(user_name, user_password, user_email, created_at) 
VALUES ('cos', '1234', 'cos@nate.com', NOW());

INSERT INTO orders(order_name, order_price, order_qty,  product_id, user_id,  created_at) VALUES('바나나', 3000, 10, 1, 1,  NOW());
INSERT INTO orders(order_name, order_price, order_qty,  product_id, user_id,  created_at) VALUES('딸기', 2000, 20, 2, 2,  NOW());
```
