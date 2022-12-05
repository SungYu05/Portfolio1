package site.metacoding.firstapp.domain;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.OrderProductDto;

public interface ProductDao {
    public Product findById(Integer productId); // 상품상세보기

    public List<Product> findAll(); // 상품목록보기

    public int insert(Product product); // 상품등록

    public int update(Product product); // 상품업데이트

    public int deleteById(Integer productId); // 상품삭제

    public Product findByProductName(String productName); // 상품명중복체크

    // 추가
    public void productQtyUpdate(OrderProductDto orderProductDto);

    public void productCancleQtyUpdate(OrderProductDto orderProductDto);
}
