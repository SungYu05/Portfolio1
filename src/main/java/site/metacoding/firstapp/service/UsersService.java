package site.metacoding.firstapp.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;

@RequiredArgsConstructor
@Service
public class UsersService {
	private final UsersDao usersDao;
	
	public Users 로그인(Users users) {
		Users usersPS = usersDao.findByUserName(users.getUserName());
		if(usersPS == null) {
			return null;
		} 
		if(usersPS.getUserPassword().equals(users.getUserPassword())) {
			return usersPS;
		} else {
			return null;
		}
	}
}
