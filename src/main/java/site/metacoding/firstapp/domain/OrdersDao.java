package site.metacoding.firstapp.domain;

import java.util.List;

public interface OrdersDao {
	public void insert(Orders orders);
	public void update(Orders orders);
	public List<Orders> findAll();
	public Orders findById(Integer orderId);
	public void deleteById(Integer orderId);
}
