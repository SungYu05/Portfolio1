package site.metacoding.firstapp.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;

@RequiredArgsConstructor
@Controller
public class ProductController {
	
	private final ProductDao productDao;

    @GetMapping({"/","/product"})
    public String list(Model model) { // 상품목록보기
    	List<Product> productList = productDao.findAll();
    	model.addAttribute("productList", productList);
    	return "/product/list";
    }
    
    @PostMapping("/product/add")
    public String add(Product product) {
    	productDao.insert(product);
        return "/product/add";
    }
//    
//    @GetMapping("/product/{id}")
//    public String save() {
//        return "/product/detail";
//    }
//    
//    @PostMapping("/product/{id}/delete")
//    public String update() {
//        return "redirection:/";
//    }
//    
//    @PostMapping("/product/{id}/edit")
//    public String edit() {
//    	return " redirection:/product/detail";
//    }
    
    
    
}
