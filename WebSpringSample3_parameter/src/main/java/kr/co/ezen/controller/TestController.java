package kr.co.ezen.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ezen.beans.dataBean;
import kr.co.ezen.beans.dataBean2;
import kr.co.ezen.beans.dataBean3;

@Controller
public class TestController {

	/* 핸들러 매핑 */
	@RequestMapping(value = "/result", method = RequestMethod.GET)
	public String result(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		
		int data_1 = Integer.parseInt(data1);
		int data_2 = Integer.parseInt(data2);
		
		int sum = data_1 + data_2 ;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data1 + data2 = " + sum);
		
		return "result"; //result.jsp
	}
	@RequestMapping(value = "/result2", method = RequestMethod.GET)
	public String result2(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		
		int data_1 = Integer.parseInt(data1);
		int data_2 = Integer.parseInt(data2);
		
		int sum = data_1 + data_2 ;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data1 + data2 = " + sum);
		
		return "result2"; //result2.jsp
	}
	@RequestMapping(value = "/result3", method = RequestMethod.GET)
	public String result3(HttpServletRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3 = request.getParameter("data3");
		String data4 = request.getParameter("data4");
		String data5 = request.getParameter("data5");
		
		int data_1 = Integer.parseInt(data1);
		int data_2 = Integer.parseInt(data2);
		int data_3 = Integer.parseInt(data3);
		int data_4 = Integer.parseInt(data4);
		int data_5 = Integer.parseInt(data5);
		
		int sum = data_1 + data_2 + data_3 + data_4 + data_5 ;
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		System.out.println("data4 : " + data4);
		System.out.println("data5 : " + data5);
		System.out.println("합계는 = " + sum);
		
		return "result3"; //result3.jsp
	}
	@RequestMapping(value = "/result4", method = RequestMethod.GET)
	public String result4(HttpServletRequest request) {
		String[] data3 = request.getParameterValues("data_3");
		int sum = 0;
		
		if(data3 != null) {
			
			for(String str : data3) {
				System.out.println("data3 : " + str);
				int data_31 = Integer.parseInt(str);
				sum = sum + data_31;	
				}
		}
		System.out.println("data_3 : " + sum);
		return "result4"; //result3.jsp
	}
	@GetMapping(value = "/result5")
	public String result5(WebRequest request) {
		String data1 = request.getParameter("data1");
		String data2 = request.getParameter("data2");
		String data3 = request.getParameter("data3");
		String data4 = request.getParameter("data4");
		String data5 = request.getParameter("data5");
		
		int data_1 = Integer.parseInt(data1);
		int data_2 = Integer.parseInt(data2);
		int data_3 = Integer.parseInt(data3);
		int data_4 = Integer.parseInt(data4);
		int data_5 = Integer.parseInt(data5);
		
		int sum = data_1 + data_2+ data_3+ data_4+ data_5;
		
		System.out.println("data1~data5" + sum);
		
		return "result5"; //result5.jsp
	}
	
	@GetMapping("/test5/{data1}/{data2}/{data3}/{data4}/{data5}")
	public String test5(@PathVariable int data1,
					    @PathVariable int data2,
			 			@PathVariable int data3,
			 			@PathVariable int data4,
			 			@PathVariable int data5) {
		
		System.out.println("data1 : " + data1);
		System.out.println("data2 : " + data2);
		System.out.println("data3 : " + data3);
		System.out.println("data4 : " + data4);
		System.out.println("data5 : " + data5);
		
		int add = data1 + data2 + data3 + data4 + data5;
		System.out.println("덧셈의 합계 : " +  add);
		
		return "result6";//result6.jsp
	}
	
	  @GetMapping("/test6") 
	  public String test6(@RequestParam int data1,
			  			  @RequestParam int data2,
			  			  @RequestParam int data3,
			  			  @RequestParam int data4,
			  			  @RequestParam int data5) {
		  
		  int sum = 0;
		  sum = (data1 + data2+ data3+ data4+ data5);
			
			System.out.println("data1~data5" + sum); 
		  
		  return "result7"; //result7.jsp
	 }
	  @GetMapping("/test7") 
	  public String test7(@RequestParam(value="data1") int value1,
			  @RequestParam (value="data2") int value2,
			  @RequestParam (value="data3") int value3,
			  @RequestParam (value="data4") int value4,
			  @RequestParam (value="data5") int value5) {
		  
		  int sum = 0;
		  sum = (value1 + value2+ value3+ value4+ value5);
		  
		  System.out.println("data1~data5" + sum); 
		  
		  return "result8"; //result7.jsp
	  }
	  @GetMapping("/test8") 
	  public String test8(@RequestParam(value="data1") String data1,
			  @RequestParam (value="data2") String data2,
			  @RequestParam (value="data3") String data3,
			  @RequestParam (required = false) String data4,
			  @RequestParam (required = false) String data5) {
		  
		  int sum = 0;
		  
		  System.out.println(data1);
		  System.out.println(data2);
		  System.out.println(data3);
		  System.out.println(data4);
		  System.out.println(data5);
		  
		  System.out.println("data1~data5 =" + sum); 
		  
		  return "result9"; //result9.jsp
	  }
	  @GetMapping("/test9") 
	  public String test9(@RequestParam(value="data1") String data1,
			  @RequestParam (value="data2") String data2,
			  @RequestParam (value="data3") String data3,
			  @RequestParam (defaultValue = "0") String data4,
			  @RequestParam (defaultValue = "0") String data5) {
		  
		  int sum = 0;
		  
		  System.out.println(data1);
		  System.out.println(data2);
		  System.out.println(data3);
		  System.out.println(data4);
		  System.out.println(data5);
		  
		  System.out.println("data1~data5 =" + sum); 
		  
		  return "result10"; //result10.jsp
	  }
	  
	  @GetMapping("/test10") 
	  public String test10(@RequestParam(value="data1") String data1,
			  @RequestParam (value="data2") String data2,
			  @RequestParam (value="data3") String data3,
			  @RequestParam (required = false) String data4, //null
			  @RequestParam (defaultValue = "0") String data5) { //0
		  
		  int sum = 0;
		  
		  System.out.println(data1);
		  System.out.println(data2);
		  System.out.println(data3);
		  System.out.println(data4);
		  System.out.println(data5);
		  
		  System.out.println("data1~data5 =" + sum); 
		  
		  return "result10"; //result10.jsp
	  }
	  
	  @GetMapping("/test11") 
	  public String test11(@RequestParam Map<String, String> map) {
		  String data1 = map.get("data1");
		  String data2 = map.get("data2");
		  String data3 = map.get("data3");
		  
		  System.out.println(data1);
		  System.out.println(data2);
		  System.out.println(data3);
		  
		  return "result11";
	  }
	  @GetMapping("/test12") 
	  public String test12(@RequestParam Map<String, String> map) {
		  String data1 = map.get("data1");
		  String data2 = map.get("data2");
		  
		  System.out.println(data1);
		  System.out.println(data2);
		  
		  return "result11";
	  }
	  @GetMapping("/test13") 
	  public String test13(@RequestParam Map<String, String> map,
			  				@RequestParam List<String> data2) {
		  String data1 = map.get("data1");
		  String data22 = map.get("data2");

		  System.out.println(data1);
		  
		  for(String str : data2) {
			  System.out.println(str);
		  }
		  
		  return "result11";
	  }
//★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★	  
	  @GetMapping("/test14") 
	  public String test14(@ModelAttribute dataBean bean) {
		  System.out.println(bean.getData1()); 
			
			 for(int str : bean.getData2()) {
				 System.out.println(str); 
				 }
		  
		  return "result11";
	  }
	  @GetMapping("/test15") 
	  //public String test15(@ModelAttribute dataBean bean, @ModelAttribute dataBean2 bean2) {
		  public String test15(dataBean bean, dataBean2 bean2) {
		  System.out.println(bean.getData1()); 
		  
		  for(int str : bean.getData2()) {
			  System.out.println(str); 
		  }
		  
		  System.out.println(bean2.getData3()); 
		  for(int str : bean2.getData4()) {
			  System.out.println(str); 
		  }
		  
		  return "result11";
	  }
	  @GetMapping("/test16") 
	  public String test16(HttpServletRequest request) {
		     request.setAttribute("data1", 100);
		     request.setAttribute("data2", 200);
		  return "result12";
	  }
	  @GetMapping("/test17") 
	  public String test17(Model model) {
		  model.addAttribute("data3", 300);
		  model.addAttribute("data4", 400);
		  return "result13";
	  }
	  @GetMapping("/test18") 
	  public ModelAndView test18(ModelAndView mav) {
		  mav.addObject("data5", 500);
		  mav.addObject("data6", 600);
		  mav.setViewName("result14");
		  return mav;
	  }
	  @PostMapping("/test19") 
	 // public String test18(@ModelAttribute dataBean3 bean3) { 생략해도 가능하지만 이걸 생략하면 modelattribute를 쓴지 모르기 때문에 웬만하면 쓰자
	 // public String test18(dataBean3 bean3) {
	  public String test18(@ModelAttribute dataBean3 bean3) {
		  System.out.println("data1 : " + bean3.getData1());
		  System.out.println("data2 : " + bean3.getData2());
		  return "result15";
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

/*
 * Parameter 추출하기 ------------------------- 클라이언트 요청 발생 시 전달하는 파라미터 데이터를 손쉽게 주입
 * 받을 수 있도록 다양한 방식을 제공하고 있습니다. Spring MVC는 Servlet/JSP 처럼 요청 방식에 따라 파라미터 추출하는
 * 방식이 달라지지는 않습니다.
 * 
 * - HttpServletRequest 사용하기 1) Spring MVC는 필요한 객체나 데이터는 주입을 받아 사용하게 됩니다. 2)
 * Servlet/JSP에서 파라미터 데이터를 추출할 때 HttpServletRequest request 객체를 통하게 되는데 Spring
 * MVC에서 이 객체를 주입 받아 사용할 수 있습니다. 3) 파라미터 추출 뿐만 아니라 HttpServletRequest 객체가 필요할 경우
 * 사용하면 됩니다.
 * 
 * @GetMapping("/test1") public String test1(HttpServletRequest request) {
 * 
 * String data1 = request.getParameter("data1"); String data2 =
 * request.getParameter("data2"); String [] data3 =
 * request.getParameterValues("data3");
 * 
 * … 생략 }
 * 
 * 
 * - WebRequest 사용하기 WebRequest는 HttpServletRequest 클래스를 확장한 클래스입니다.
 * 
 * @GetMapping("/test3") public String test3(WebRequest request) {
 * 
 * String data1 = request.getParameter("data1"); String data2 =
 * request.getParameter("data2"); String [] data3 =
 * request.getParameterValues("data3");
 * 
 * …생략… }
 * 
 * 
 * - @PathVariable 데이터가 요청 주소에 있을 경우 값을 주입 받을 수 있는 어노테이션입니다. Restful API 서버
 * 프로그래밍시 많이 사용하는 방식입니다. 데이터1/2/3 요청주소/값1/값2/값3
 * 
 * 형 변환
 * 
 * @GetMapping("/test4/{data1}/{data2}/{data3}") public String
 * test4(@PathVariable int data1, 
 * 
 * @PathVariable int data2, 
 * 
 * @PathVariable int data3) { ......... }
 * 
 * - @RequestParam 1) 파라미터 데이터를 직접 주입 받을 수 있습니다. 2) 지정된 변수의 이름과 파라미터의 이름이 같을 경우
 * 값을 주입 받습니다. 3) 가능한 경우 형 변환도 처리해줍니다. 4) value : 파라미터의 이름과 변수의 이름이 다를 경우 파라미터
 * 이름을 지정합니다. 5) required : false를 설정하면 지정된 이름의 파라미터가 없을 경우 null이 주입되고, 있으면 넘어온
 * 값으로 됩니다.(문자인 경우) 6) (defaultValue = "0")설정하면 기본값으로 설정되고, 있으면 넘어온 값으로 됩니다.
 * 
 * @GetMapping("/test7") public String test7(@RequestParam(value = "data1")
 * String value1,
 * 
 * @RequestParam(value = "data2", required = false) String value2,
 * 
 * @RequestParam(value = "data3", defaultValue = "default") String value3) {
 * 
 * .......... }
 * 
 * ★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★
객체로 파라미터 주입받기
-----------------------------
 - Map으로 주입 받기
 1) 클라이언트가 전달 하는 모든 파라미터 데이터를 한번에 Map으로 받을 수 있습니다. 
 2) 단, 동일 명으로 전달되는 2개 이상의 파라미터는 하나만 담기게 됩니다.
 3) 동일명으로 전달되는 파라미터가 2개 이상이라면 List로 주입 받아야 합니다.

  public String test1(@RequestParam Map<String, String> map, 
		  @RequestParam List<String> data3) {

	}

 - @ModelAttribute
  1) ModelAttribute 어노테이션을 사용하면 파라미터를 객체로 주입받을 수 있습니다.
  2) 전달되는 파라미터의 이름과 동일한 프로퍼티에 자동으로 주입됩니다.
  3) 이 어노테이션은 생략이 가능합니다. 이러한 객체를 커맨드 객체(Command Object)라고 부릅니다.

  public String test2(@ModelAttribute DataBean1 bean1, 
		      @ModelAttribute DataBean2 bean2) {

  }
 */


/*
 * .ViewResolver ------------------ - 컨트롤러에서 전달 받은 View의 이름을 토대로 jsp를 찾아 선택하고
 * jsp 데이터를 분석해 응답결과를 만들어 전달하는 요소 입니다. 본 과정에서는 ViewResolver가 사용할 View의 이름을 지정하는
 * 방법과 jsp 를 통해 응답 결과를 만들 때 필요한 데이터를 전달하는 방법에 대해 살펴봅니다
 * 
 * 
 * - HttpServletRequest - Spring MVC는 jsp 를 처리할 때 HttpServletRequest 객체를 jsp 쪽으로
 * 전달합니다. ViewResolver는 이를 이용해 JSP 작업시 데이터를 사용할 수 있습니다.
 * 
 * public String test2(HttpServletRequest request) {
 * request.setAttribute("value1", 100);
 * request.setAttribute("value2", 200);
 * return "test2"; 
 * }
 * 
 * - Model Model 객체를 주입 받아 셋팅하면 HttpServletRequest 객체에 담겨 이를 JSP로 전달할 수 있습니다.
 * 
 * public String test3(Model model) { model.addAttribute("value3", 300);
 * model.addAttribute("value4", 400); return "test3"; }
 * 
 * - ModelAndView
 * 
 * ModelAndView는 Model에 값을 셋팅하는 기능과 View의 이름을 지정하는 기능을 모두 가지고 있습니다. public
 * ModelAndView test5(ModelAndView mv) { mv.addObject("value3000", 3000);
 * mv.addObject("value4000", 4000); mv.setViewName("test5"); return mv; }
 * 
 * ViewResolver에 의해 JSP가 실행되고 응답결과가 만들어집니다. Controller 에서 View를 지정할 때
 * ViewResolver가 사용할 데이터를 Request 영역에 저장할 수 있습니다.
 * 
 * 
 * .커맨드 객체 ------------------- 클라이언트가 전달해 주는 파라미터 데이터를 주입 받기 위해 사용하는 객체
 * 
 * - Request를 통해 전달
 * 
 * @PostMapping("/test1") public String test1(@ModelAttribute DataBean bean) {
 * return "test1"; }
 * 
 * 
 * 커맨드 객체는 HttpServletRequest 객체에 자동으로 담기고 jsp로 전달됩니다. 이 때, HttpServletRequest
 * 객체에 저장되는 이름은 클래스의 이름으로 결정됩니다.
 * 
 * @PostMapping("/test1") public String test1(@ModelAttribute DataBean bean) {
 * return "test1"; }
 * 
 * <h3>data1 : ${requestScope.dataBean.data1 }</h3> <h3>data2 :
 * ${requestScope.dataBean.data2 }</h3>
 * 
 * - 저장되는 이름 설정 HttpServletRequest에 저장되는 이름을 지정하고 싶다면 ModelAttribute 어노테이션에 지정하면
 * 됩니다.
 * 
 * @PostMapping("/test2") public String test2(@ModelAttribute("testData")
 * DataBean bean) { return "test2"; }
 * 
 * <h3>data1 : ${requestScope.testData.data1 }</h3> <h3>data2 :
 * ${requestScope.testData.data2 }</h3>
 * 
 * 
 * 
 */