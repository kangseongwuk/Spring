package kr.co.ezen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class sub1Controller {
	@RequestMapping(value = "/sub1/test3", method = RequestMethod.GET)
	public String test3() {
		System.out.println("/sub1/test3");
		return "sub1/test3"; //sub1/test3.jsp
	}
	@RequestMapping(value = "/sub1/test4", method = RequestMethod.GET)
	public String test4() {
		System.out.println("/sub1/test4");
		return "sub1/test4"; //sub1/test4.jsp
	}
}
