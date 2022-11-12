package site.metacoding.firstapp.domain;

import java.sql.Timestamp;

import lombok.Getter;

@Getter
public class Users {
	private Integer userId;
	private String userName;
	private String userPassword;
	private String userEmail;
	private Timestamp createdAt;
	
	public Users(Integer userId, String userName, String userPassword, String userEmail, Timestamp createdAt) {
		this.userName = userName;
		this.userPassword = userPassword;
		this.userEmail = userEmail;
		this.createdAt = createdAt;
	}
	
	
}
