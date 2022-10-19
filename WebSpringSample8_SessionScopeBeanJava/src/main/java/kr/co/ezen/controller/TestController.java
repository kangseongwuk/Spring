package kr.co.ezen.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttribute;

import kr.co.ezen.beans.DataBean;
import kr.co.ezen.beans.DataBean2;
import kr.co.ezen.beans.DataBean3;
import kr.co.ezen.beans.DataBean4;

@Controller
public class TestController {

	@Autowired // byType 형식으로 처리 default값은 byType임
	DataBean sessionBean;
	
	@Resource(name = "sessionBean2") 
	DataBean2 sessionBean2; //byName 형식으로 처리
	
	@Autowired // byType 형식으로 처리 default값은 byType임
	DataBean3 sessionBean3;
	
	@Resource(name = "sessionBean4") 
	DataBean4 sessionBean4; //byName 형식으로 처리
	
	@GetMapping("/test1")
	public String test1() {
		
		sessionBean.setData1("문자열1");
		sessionBean.setData2("문자열2");
		sessionBean.setData3(1000);

		sessionBean2.setData4("문자열3");
		sessionBean2.setData5("문자열4");
		sessionBean2.setData6(2000);
		
		sessionBean3.setData7("문자열5");
		sessionBean3.setData8("문자열6");
		sessionBean3.setData9(3000);
		
		sessionBean4.setData10("문자열7");
		sessionBean4.setData11("문자열8");
		sessionBean4.setData12(4000);
		
		
		return "test1";
	}
	
	@GetMapping("/result")
	public String result(Model model) {
		
		model.addAttribute("sessionBean", sessionBean);
		model.addAttribute("sessionBean2", sessionBean2);
		model.addAttribute("sessionBean3", sessionBean3);
		model.addAttribute("sessionBean4", sessionBean4);
		
		return "result";
	}
	@GetMapping("/test2")
	public String test2(HttpSession session) {
		
		
		session.setAttribute("data3", "문자열3");
		session.setAttribute("data4", "문자열4");
		
		//                  ObjectName, String type
//		request.setAttribute("data1", "1.문자열 입니다.");
//		request.setAttribute("data2", "2.문자열 입니다.");
		
		return "test2";
	}
	
	@GetMapping("/result2")
	public String result2(HttpSession session) {
		
		
		//session area에 저장합니다.
		String data3 = (String) session.getAttribute("data3");
		String data4 = (String) session.getAttribute("data4");
		System.out.println(data3);
		System.out.println(data4);
		
		return "result2";
		
	}	
		
		@GetMapping("/test3")
		public String test3(HttpSession session) {
			DataBean bean = new DataBean();
			
			bean.setData1("문자열5");
			bean.setData2("문자열6");
			bean.setData3(2500);
			
			session.setAttribute("kang",bean);
			
			//                  ObjectName, String type
//		request.setAttribute("data1", "1.문자열 입니다.");
//		request.setAttribute("data2", "2.문자열 입니다.");
			
			return "test3";
		}
		
		@GetMapping("/result3")
		public String result3(@SessionAttribute("kang") DataBean bean) {
			
			
			//session area에 저장합니다.
//			DataBean bean = (DataBean)session.getAttribute("bean");
			
//			System.out.println(bean.getData1());
//			System.out.println(bean.getData2());
//			System.out.println(bean.getData3());

			return "result3";
	}
		@GetMapping("/test4")
		public String test4(@ModelAttribute("sessionBean") DataBean sessionBean,
				@ModelAttribute("sessionBean2") DataBean sessionBean2) {
			
			sessionBean.setData1("문자열7");
			sessionBean.setData2("문자열8");
			sessionBean.setData3(45000);
			
			sessionBean2.setData1("문자열9");
			sessionBean2.setData2("문자열10");
			sessionBean2.setData3(20000);
			
			return "test4";
		}
		
		@GetMapping("/result4")
		public String result4(@ModelAttribute("sessionBean") DataBean sessionBean,
											@ModelAttribute("sessionBean2") DataBean sessionBean2) {
			
			return "result4";
		}
	
	
}