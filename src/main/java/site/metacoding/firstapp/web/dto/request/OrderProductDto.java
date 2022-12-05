package site.metacoding.firstapp.web.dto.request;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.firstapp.domain.Orders;

@Getter
@Setter
public class OrderProductDto {
	private Integer ordersId;
	private String orderName;
	private Integer orderPrice;
	private Integer orderQty;
	private Integer productId;

	public Orders toEntity(Integer userId) {
		Orders orders = new Orders(this.ordersId, this.orderName, this.orderPrice, this.orderQty, this.productId,
				userId);
		return orders;

	}
}
