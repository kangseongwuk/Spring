package kr.co.ezen.controller;

import org.apache.bval.jsr303.Jsr303Features.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ezen.beans.*;

@Controller //어노테이션 써야함
public class TagController {
	//test1으로 부터 들어온 요청
	
	@GetMapping("/test1")
	public String test1(DataBean bean, Model model) {
		
		String[] data_list1 = {"user_name", "user_id", "user_pw", "user_postcode", "user_address1", "user_address2"};
		model.addAttribute("data_list1", data_list1);
		
		return "test1";//test1.jsp
	}
	
	@PostMapping(value = "/result")
	public String result(@ModelAttribute("test") DataBean bean) {
		
//		bean.setUser_name("user_name");
//		bean.setUser_id("user_id");
//		bean.setUser_pw("user_pw");
//		bean.setUser_postcode("user_postcode");
//		bean.setUser_address1("user_address1");
//		bean.setUser_address2("user_address2");
		
		
		return "result";
	}
}
