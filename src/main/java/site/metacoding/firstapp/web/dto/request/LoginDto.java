package site.metacoding.firstapp.web.dto.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDto {
	private String userName;
	private String userPassword;
	private String role; // 2. dto에 role 추가
}
