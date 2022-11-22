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
		if (usersPS == null) {
			return null;
		}
		if (usersPS.getUserPassword().equals(loginDto.getUserPassword())) {
			if (usersPS.getRole().equals("user")) {
				return usersPS;
			}
			return null;
		} else {
			return null;
		}
	}

	// 3. admin로그인 서비스 만들기 (role이 "admin"일 경우 통과, 아닐 경우 null값으로 튕구기)
	public Users admin로그인(LoginDto loginDto) {
		Users usersPS = usersDao.findByUserName(loginDto.getUserName());
		if (usersPS == null) {
			return null;
		}
		if (usersPS.getUserPassword().equals(loginDto.getUserPassword())) {
			if (usersPS.getRole().equals("admin")) {
				return usersPS;
			}
			return null;
		} else {
			return null;
		}
	}
}
