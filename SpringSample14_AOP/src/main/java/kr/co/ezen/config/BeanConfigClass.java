package kr.co.ezen.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.ezen.beans.TestBean;
import kr.co.ezen.beans.TestBean2;
import kr.co.ezen.beans2.TestBean3;

@Configuration
public class BeanConfigClass {

	@Bean(initMethod = "init1", destroyMethod = "destory1")
	@Lazy
	public TestBean obj1() {
		return new TestBean();
	}

	@Bean
	@Lazy
	public TestBean2 obj2() {
		return new TestBean2();
	}
	
	
	@Bean(autowire = Autowire.BY_NAME) // 객체주입!!!! 그럼 NULL 값에서 주소값으로 변함
	@Lazy
	public TestBean3 obj3() {
		return new TestBean3();
	}
}
