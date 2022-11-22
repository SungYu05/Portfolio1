package site.metacoding.firstapp.domain;

import java.util.List;

import site.metacoding.firstapp.web.dto.request.LoginDto;

public interface UsersDao {
	public List<Users> findAll(); 
	public Users findById(Integer userId);
	public int insert(Users users); // 회원가입
	public int update(Users users); 
	public int deleteById(Integer userId);
	public Users findByUserName(String userName); // 로그인을 위한 DAO
	public Users adminLogin(LoginDto loginDto); // 1. admin로그인
}
