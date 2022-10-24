package kr.co.ezen.advisor;

import org.aspectj.lang.ProceedingJoinPoint;

public class AdvisorClass {

	public void beforeMethod() {
		System.out.println("beforeMethod를 호출했다. 2순위");
	}
	public void afterMethod() {
		System.out.println("afterMethod를 호출했다.예외 발생 여부에 관계없이 호출된 메소드의 동작이 완료되면 동작하는 Advice 후순위");
	}
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("aroundMethod를 호출했다.1번메소드 호출 전과 후에 동작하는 Advice");
		
		Object object  = pjp.proceed();
		System.out.println("aroundMethod를 호출했다.2번메소드 호출 전과 후에 동작하는 Advice");
	
		return object;
	}
	
	public void afterReturningMethod() {
		System.out.println("afterReturning을 호출했다. 예외 없이 호출된 메소드의 동작이 완료되면 동작하는 Advice");
		System.out.println("처리가 잘 되었습니다(예외처리없이 실행되었습니다.");
		
	}
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod을 호출했다. 호출된 메소드 동작 중 예외가 발생하였을 때 동작하는 Advice");
		System.out.println("처리가 실패했습니다.(예외처리");
		
	}
}