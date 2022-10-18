package kr.co.ezen.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class TestBean2 {

	public TestBean2() {
		System.out.println("TestBean2 class의 생성자입니다");
	}
	
		
	@PostConstruct
	public void init() {
		int sum = 100+ 300;
		
		System.out.println("Adder : " + sum);
	}
	
	public void message() {
		System.out.println("여기는 중간 부분 입니다.");
	}
	
	@PreDestroy
	public void destroy() {
		int sum = 100*300;
		
		System.out.println("Multi : " + sum);
	}
}
