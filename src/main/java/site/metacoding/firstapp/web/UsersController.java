package site.metacoding.firstapp.web;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import lombok.RequiredArgsConstructor;
import site.metacoding.firstapp.domain.Users;
import site.metacoding.firstapp.domain.UsersDao;
import site.metacoding.firstapp.service.UsersService;
import site.metacoding.firstapp.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class UsersController {

	private final UsersDao usersDao;
	private final UsersService usersService;
	private final HttpSession session;

	@GetMapping("/login")
	public String login () {
		return "/users/login";
	}
	
	@PostMapping("/login")
	public String login(Users users) {
		Users principal = usersService.로그인(users);
		if (principal == null) {
			return null;
		}
		session.setAttribute("principal", principal);
		return "redirect:/";
	}
	
	@GetMapping("/logout")
	public String logout() {
		session.invalidate();
		return "redirect:/login";
	}
	
	@GetMapping("/join")
	public String joinForm(Users users) {
		return "/users/join";
	}
	
	@PostMapping("/join")
	public String join(Users users) {
		usersDao.insert(users);
		return "redirect:/";
	}

}
