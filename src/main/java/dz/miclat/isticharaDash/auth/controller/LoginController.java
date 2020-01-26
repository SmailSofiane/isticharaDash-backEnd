package dz.miclat.isticharaDash.auth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@RequestMapping("/hello")
	public String login()
	{
		return "you are logged In!";
	}
	
}
