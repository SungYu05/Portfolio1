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
import site.metacoding.firstapp.web.dto.request.LoginDto;
import site.metacoding.firstapp.web.dto.response.CMRespDto;

@RequiredArgsConstructor
@Controller
public class UsersController {

	private final UsersDao usersDao;
	private final UsersService usersService;
	private final HttpSession session;

	@GetMapping("/login")
	public String login() {
		return "users/login";
	}

	@GetMapping("/admin/login")
	public String adminLogin() {
		return "users/adminLogin";
	}

	// 유저 로그인
	@PostMapping("/login")
	public String login(LoginDto loginDto) {
		Users principal = usersService.로그인(loginDto);
		if (principal == null) {
			return "redirect:/login";
		}
		session.setAttribute("principal", principal);
		return "redirect:/";
	}

	// 5. admin 로그인
	@PostMapping("/admin/login")
	public String adminLogin(LoginDto loginDto) {
		Users principal = usersService.admin로그인(loginDto);
		if (principal == null) {
			return "redirect:/admin/login";
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
		return "users/join";
	}

	@PostMapping("/join")
	public String join(Users users) {
		usersDao.insert(users);
		return "redirect:/";
	}

}
