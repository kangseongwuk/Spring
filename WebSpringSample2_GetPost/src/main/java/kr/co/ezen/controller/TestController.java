package kr.co.ezen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {

	/* 핸들러 매핑 */
	@RequestMapping(value = "/test1", method = RequestMethod.GET)
	public String test1() {
		System.out.println("test1");
		return "test1"; //test1.jsp
	}
	@PostMapping(value = "/test2")
	public String test2() {
		System.out.println("test2");
		return "test2"; //test2.jsp
	}
	@GetMapping(value = "/test3")
	public String test3() {
		System.out.println("test3");
		return "test3"; //test2.jsp
	}

	
}
