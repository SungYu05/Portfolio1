package site.metacoding.firstapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
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
	
	@GetMapping("/orders/list")
	public String orderList(Model model) {
		Users principal = (Users) session.getAttribute("principal");
		model.addAttribute("orderList", ordersDao.findAll(principal.getUserId()));
		return "orders/orderList";
	}
	
	@PostMapping("/orders/{productId}")
	public String orderProduct(@PathVariable Integer productId, OrderProductDto orderProductDto) {
		Users principal = (Users) session.getAttribute("principal");
		if(principal == null) {
			return "redirect:/login";
		}
		Product productPS = productDao.findById(productId);
		if (productPS.getProductQty() - orderProductDto.getOrderQty() <= 0) {
			return "redirect:/";
		}
		productDao.productQtyUpdate(orderProductDto);
		ordersDao.insert(orderProductDto.toEntity(principal.getUserId()));
		return  "redirect:/";
	}
}
