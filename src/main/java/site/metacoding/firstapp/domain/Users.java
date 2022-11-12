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
}
