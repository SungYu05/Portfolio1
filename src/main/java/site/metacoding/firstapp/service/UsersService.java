package site.metacoding.firstapp.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.web.dto.request.LoginDto;

@RequiredArgsConstructor
@Service
public class UsersService {
	private final UsersDao usersDao;
	
	public Users 로그인(LoginDto loginDto) {
		Users usersPS = usersDao.findByUserName(loginDto.getUserName());
		if(usersPS == null) {
			return null;
		} 
		if(usersPS.getUserPassword().equals(loginDto.getUserPassword())) {
			return usersPS;
		} else {
			return null;
		}
	}
}
