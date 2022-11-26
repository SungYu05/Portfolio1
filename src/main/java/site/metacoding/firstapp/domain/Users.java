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
}
