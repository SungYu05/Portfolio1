package site.metacoding.firstapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Orders;
import site.metacoding.firstapp.domain.OrdersDao;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.web.dto.request.OrderProductDto;

@RequiredArgsConstructor
@Controller
public class OrdersController {
	private final ProductDao productDao;
	private final OrdersDao ordersDao;
	private final HttpSession session;

	@GetMapping("/orders/list") // 구매목록
	public String orderList(Model model) {
		Users principal = (Users) session.getAttribute("principal");
		if (principal == null) {
			return "redirect:/login";
		}
		model.addAttribute("orderList", ordersDao.findAll(principal.getUserId()));
		return "orders/orderList";
	}

	@GetMapping("/users/orders/{userId}/list") // 유저구매목록
	public String userOrderList(@PathVariable Integer userId, Model model) {
		Users principal = (Users) session.getAttribute("principal");
		if (principal == null) {
			return "redirect:/login";
		}
		model.addAttribute("userOrderList", ordersDao.userFindAll(userId));
		return "orders/userOrderList";
	}

	// 유저전체주문목록4. 컨트롤러 만들기
	@GetMapping("/users/orders/list")
	public String userOrderFindAll(Model model) {
		Users principal = (Users) session.getAttribute("principal");
		if (principal == null) {
			return "redirect:/login";
		}
		model.addAttribute("userOrderFindAll", ordersDao.userOrderFindAll());
		return "orders/userOrderFindAll";
	}

	@PostMapping("/orders/{ordersId}/delete") // 구매취소
	public String orderDelete(@PathVariable Integer ordersId, OrderProductDto orderProductDto) {
		Users principal = (Users) session.getAttribute("principal");
		if (principal == null) {
			return "redirect:/login";
		}
		Orders ordersPS = ordersDao.findById(ordersId);
		productDao.productCancleQtyUpdate(orderProductDto);
		ordersDao.deleteById(ordersPS.getOrdersId());
		return "redirect:/";
	}

	@PostMapping("/orders/{productId}") // 상품 구매하기
	public String orderProduct(@PathVariable Integer productId, OrderProductDto orderProductDto) {
		Users principal = (Users) session.getAttribute("principal");
		if (principal == null) {
			return "redirect:/login";
		}
		Product productPS = productDao.findById(productId);
		if (productPS.getProductQty() - orderProductDto.getOrderQty() < 0) {
			return "redirect:/";
		}
		productDao.productQtyUpdate(orderProductDto);
		ordersDao.insert(orderProductDto.toEntity(principal.getUserId()));
		return "redirect:/";
	}
}
