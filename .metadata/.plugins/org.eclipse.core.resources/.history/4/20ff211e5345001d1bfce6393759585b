package kr.co.ezen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sub1/sub2/") //이걸해놓으면 경로를 앞에꺼 중복이 필요없다.수정이 용이하다
public class sub2Controller {
	@RequestMapping(value = "test5", method = RequestMethod.GET)
	public String test4() {
		System.out.println("/sub1/sub2/test5");
		return "sub1/sub2/test5"; //sub1/sub2/test5.jsp
	}
}
