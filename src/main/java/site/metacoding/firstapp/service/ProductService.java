package site.metacoding.firstapp.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Product;
import site.metacoding.firstapp.domain.ProductDao;

@RequiredArgsConstructor
@Service
public class ProductService {
	private final ProductDao productDao;

	public boolean 상품명중복확인(String productName) {
		Product productPS = productDao.findByProductName(productName);

		if (productPS == null) {
			return false;
		} else {
			return true;
		}
	}
}
