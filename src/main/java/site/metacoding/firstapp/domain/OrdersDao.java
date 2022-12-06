package site.metacoding.firstapp.domain;

import java.util.List;

public interface OrdersDao {
	public void insert(Orders orders);

	public void update(Orders orders);

	public List<Orders> findAll(Integer userId); // 주문 후 수량 // userId 받는 거로 변경

	public List<Orders> userFindAll(Integer userId); // 유저구매내역

	public Orders findById(Integer orderId);

	public void deleteById(Integer orderId);
}
