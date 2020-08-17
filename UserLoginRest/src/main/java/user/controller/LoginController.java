package user.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import user.model.User;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {

	@GetMapping(path = "/validateLogin")
	public User validateLogin() {
		return new User("User successfully authenticated");
	}
}
