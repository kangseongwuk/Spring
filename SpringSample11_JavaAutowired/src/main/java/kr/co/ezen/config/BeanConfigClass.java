package kr.co.ezen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.ezen.beans.DataBean;
import kr.co.ezen.beans.TestBean;

@Configuration
public class BeanConfigClass {

	@Bean
	public TestBean java1() { //java1의 이름이 객체명이 됩니다.
		return new TestBean(100, 123.456, "임성찬2", new DataBean());
	}
	
	
	
}
