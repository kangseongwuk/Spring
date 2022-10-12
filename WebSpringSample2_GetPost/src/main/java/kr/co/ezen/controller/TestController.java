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
	
	@RequestMapping(value = "/test2", method = RequestMethod.GET)
	public String test2_get() {
		System.out.println("test2");
		return "test2_get"; //test2.jsp
	}
	
	@RequestMapping(value = "/test2", method = RequestMethod.POST)
	public String test2_post() {
		System.out.println("test1");
		return "test2_post"; //test2.jsp
	}
	
	 @GetMapping(value = "/test3") 
	 public String test3_get() {
	 System.out.println("test3"); 
	 return "test3_get"; //test3_get.jsp 
	 }
	 
	 @PostMapping(value = "/test3") 
	 public String test3_post() {
	 System.out.println("test3"); 
	 return "test3_post"; //test3_post.jsp 
	 }
	 
	 @RequestMapping(value = "/test4", method = {RequestMethod.GET,	RequestMethod.POST}) 
	 public String test7() {
	 System.out.println("test4");
	 return "test4"; //test4.jsp
	 }

	
}

/*
 * .요청 방식 지정하기
 * 
 * Spring MVC 는 요청 주소별로 메서드를 정의할 수도 있지만 같은 요청 주소에서 요청 방식에 따라 메서드를 정의할 수도 있습니다.
 * GET, POST, PUT, DELELTE, PATCH 에 대해 처리할 수 있습니다.
 * 
 * @RequestMapping RequestMapping 어노테이션은 요청 주소 셋팅 뿐만 아니라 요청 방식도 설정할 수 있습니다.
 * 
 * @RequestMapping(value = "/test1", method = RequestMethod.GET) public String
 * test1() { return "test1"; }
 * 
 * 요청 어노테이션
 * 
 * RequestMapping 대신 요청별로 제공되는 어노테이션을 사용할 수도 있습니다.
 * 
 * @GetMapping("/test4") public String test4() { return "test4"; }
 * 
 * @PostMapping("/test5") public String test5() { return "test5"; }
 * 
 * 
 * 동시에 설정하기
 * 
 * RequestMapping은 요청 방식들을 동시에 설정할 수 있습니다.
 * 
 * @RequestMapping(value = "/test7", method = {RequestMethod.GET,
 * RequestMethod.POST}) public String test7() { return "test7"; }
 */

