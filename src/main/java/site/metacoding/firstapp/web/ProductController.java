package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;

@RequiredArgsConstructor
@Controller
public class ProductController {

	private final ProductDao productDao;

	@GetMapping({ "/", "/product" })
	public String list(Model model) { // 상품목록보기
		List<Product> productList = productDao.findAll();
		model.addAttribute("productList", productList);
		return "/product/list";
	}

	@GetMapping("/product/add") // 상품등록
	public String addForm(Product product) {
		return "/product/add";
	}

	@PostMapping("/product/add") // 상품등록
	public String add(Product product) {
		productDao.insert(product);
		return "redirect:/";
	}

	@GetMapping("/product/{productId}") // 상품상세보기
	public String detail(@PathVariable Integer productId, Model model) {
		Product product = productDao.findById(productId);
		model.addAttribute("product", product);
		return "/product/detail";
	}

    @PostMapping("/product/{productId}/delete")
    public String delete(@PathVariable Integer productId) {
    	productDao.deleteById(productId);
    	return "redirect:/";
    }
    

	@GetMapping("/product/{productId}/edit") // 상품수정
	public String editForm(@PathVariable Integer productId, Model model) {
		model.addAttribute("edit", model);
		return "/product/edit";
	}

	@PostMapping("/product/{productId}/edit") // 상품수정
	public String edit(Product product, @PathVariable Integer productId) {
		// 영속화
		Product productPS = productDao.findById(productId);
		// 영속화된 객체 변경
		productPS.update(productPS);
		// 디비 변경
		productDao.update(product);
		return "redirect:/";
	}

}
