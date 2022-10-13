package kr.co.ezen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	//index.jsp만 컨트롤한다 다른게 들어오면 안됨
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home() {
		System.out.println("home");
		return "index";
	}
	
}
