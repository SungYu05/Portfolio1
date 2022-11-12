package site.metacoding.firstapp.domain;

import java.util.List;

public interface UsersDao {
	public List<Users> findAll(); 
	public Users findById(Integer userId);
	public int insert(Users users); // 회원가입
	public int update(Users users); 
	public int deleteById(Integer userId);
	public Users findByUserName(String userName); // 로그인

}
