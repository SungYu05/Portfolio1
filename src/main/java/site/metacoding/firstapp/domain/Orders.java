package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class Orders {
	private Integer orderId;
	private Integer usersId;
	private Integer productsId;
    private Timestamp createdAt;
    
	public Orders(Integer usersId, Integer productsId) {
		this.usersId = usersId;
		this.productsId = productsId;
	}
    
    
}
