package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class Orders { // 주문테이블
	private Integer ordersId;
	private String orderName;
	private Integer orderPrice;
	private Integer orderQty; // 주문수량
	private Integer productId;
	private Integer userId;
	private Timestamp createdAt;
	
	public Orders(String orderName, Integer orderPrice, Integer orderQty, Integer productId, Integer userId) {
		this.orderName = orderName;
		this.orderPrice = orderPrice; 
		this.orderQty = orderQty;
		this.productId = productId;
		this.userId = userId;
	}
	

	

}
