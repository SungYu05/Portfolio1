package site.metacoding.firstapp.web.dto.request;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserOrderDto {
    // 유저전체주문목록1. DTO 만들기
    private String userName;
    private String orderName;
    private Integer orderPrice;
    private Integer orderQty;
    private Timestamp createdAt;
}
