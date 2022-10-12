package kr.co.ezen.processor;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {

	// init-method 호출전에 
	public Object postProcessBeforeInitialization(Object bean, String beanName) {

		System.out.println("before : ~이전에");
		int sum, sum2, sum3, sum4;
		
		switch (beanName) {
			case "tb3" : sum = 100 + 200;
				System.out.println("덧셈의 합계: " + sum); 
						sum2 = 300 * 300; 
				System.out.println("곱셈의 합계: " + sum2);
						break;
			case "tb4" : sum3 = 100 - 200;
				System.out.println("뺄셈의 합계: " + sum3); 
					sum4 = 500 / 20;
				System.out.println("나눗셈의 합계: " + sum4);
				break;
			default:
				System.out.println("tb3, tb4 객체가 아니므로 연산하지 않습니다.");
				break;
		}			
		
		return bean;
	}
	
	// init-method 호출후에 
	public static void postProcessAfterInitialization(int x, int y) {
		int sum = x + y;
		System.out.println("After : " + sum); 		
	}
}
