package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class Users {
	private Integer userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private String role;
	private Timestamp createdAt;

	public Users(Integer userId, String userName, String userPassword, String userEmail, String role,
			Timestamp createdAt) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.role = role;
		this.createdAt = createdAt;
	}

	// 회원정보수정3. 영속화된 객체 변경
	public void update(Users users) {
		this.userName = users.getUserName();
		this.userPassword = users.getUserPassword();
		this.userEmail = users.getUserEmail();
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
}
