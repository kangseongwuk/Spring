package kr.co.ezen.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.ezen.beans.TestBean3;
/* ====================================================================================================
* 
* 자바 빈 : 데이터를 표현하는 것을 목적으로 하는 자바클래스(클래스에 값을 저장하는 속성필드, get, set 메소드, 기본생성자 포함)
* 
* 스프링 빈 : 스프링 IoC 컨테이너가 관리하는 객체.
* 
* [장점]
* -의존성 관리 : 스코프 관리
* 	1)singleton 방식 : default, 주소가 항상 똑같다.
* 	2)prototype 방식 : 요청할 때마다 새로운 객체를 생성
* 	3)request : http 요청별로 인스턴스화되어 요청이 끝나면 소멸(Spring MVC 용도)
* 	4)session : http 세션별로 인스턴스화되어 요청이 끝나면 소멸(Spring MVC 용도)
* 	5)golbal session : 포틀린 기반의 웹 에플리케이션 용도,
* 		전역 세션 스코프의 빈은 같은 스프링 MVC를 사용한 포탈 애플리케이션 내의 모든 포틀릿 사이에 공유가 가능합니다.
* 	6)thread : 새 스레드에서 요청하며 새로운 bean인스턴스를 생성, 같은 스레드에서는 항상 같은 bean을 반환합니다.
* 	7)custom : org.springframework.beans.factory.config.Scope를 구현하고 커스텀 스코프를 스프링의 설정에 등록하여 사용
* 
* .Bean Life Cycle : 라이프 사이클 인터페이스
* -----------------------------------------
* 	객체 생성 -> 의존설정 -> 초기화 -> 소멸
* 	-사용할 객체를 ben configuration file에 정의하고 필요할 때 객체를 가져와서 사용하는 방법을 이용
* 	-bean 태그 : <bean> ~~ </bean> : 사용할 bean을 정의하는 태그
* 	-기본속성
* 1)id : Bean객체를 가져오기 위해 사용하는 이름을 지정한다.
* 2)class : 객체를 생성하기 위하여 사용할 클래스를 지정한다.
* 3)lazy-init : singleton 인 경우에는 xml을 로딩할 때 객체 생성 여부를 설정한다.
* 		true옵션인 경우에는 xml로딩 시에 객체를 생성하지 않고, 객체를 가져올 때(get Bean) 생성합니다.
* 4)scope : 객체의 범위를 지정합니다.
* 		singleton : 객체를 하나만 생성하여 사용합니다. ( 객체의 재사용성 )
* 		prototype : 객체를 호출 할 때마다 객체를 생성합니다. ( 항상 서로다른 주소값을 가지고 처리 )
* 
* <!-- xml을 로딩할 때 자동으로 객체가 생성됩니다. -->
* 		<!-- <bean class = "kr.co.korea.beans.TestBean"/> -->
* 
* <!-- id속성을 주면 getBean()를 이용하여 객체의 주소값을 받아 사용할 수 있는데, singleton이다. -->
* 		<bean id='test' class="kr.co.korea.beans.testBean"/>
* 
* <!-- xml을 로딩할 때 객체가 생성되지 않고, id속성을 주면 getBean()를 이용하여 객체의 주소값을 받아 사용할 수있는데,
* 			객체는 하나만 생성되는 singleton이다 -->
* 		<bean id='test' class="kr.co.korea.beans.testBean" lazy-init="true"/>
* 
* <!-- xml을 로딩할 때 객체가 생성되지 않고, id속성을 주면 getBean()를 이용하여 메소드를 호출 할 때마다
* 			 새로운 객체의 주소값을 생성하여 반환할 수 있다.-->
* 		<bean id='test' class="kr.co.korea.beans.testBean" scope="prototype"/>
* 
* -객체 생성과 소멸시에 호출되는 메소드 등록
* 1) 객체가 생성되면 가장 먼저 생성자가 호출 된다.
* 2) init-method : 생성자 호출 이후에 자동으로 호출된다.
* 3) destroy-method : 객체가 소멸 할 때 자동으로 호출됩니다.
* 4) default-init-method : init-method를 설정하지 않으면 자동으로 호출됩니다. ( 땜빵? )
* 5) default-destroy-method : destroy-method가 설정되어있지 않은 경우에 자동으로 호출됩니다.
* 
* <!-- 객체가 생성될 때 생성자가 호출된 이후에 init-method에 설정한 메소드가 자동으로 호출되고,
* 			IoC 컨테이너의 close메소드가 호출되면 객체가 소멸되며, destroy-method에 설정한 메소드가 자동으로 호출된다. -->
* 		<bean id = 'tb' class="kr.co.korea.beans.TestBean2"
* 			lazy-init="true" init-method="bean1_init" destroy-method="bean1_destroy"/>
* 
* 		<bean id = 'test7' class="kr.co.korea.beans.TestBean2"></bean>
* 
* - Bean객체의 생명주기
* 1) singleton인 경우에는 xml파일을 로딩 할 때 객체가 생성됩니다.
* 2) singleton이고, lazy-init = "true" 속성을 사용하면, getBean()를 사용 할 때 객체가 생성됩니다.
* 3) prototype인 경우에는 getBean()를 사용 할 때 객체가 생성됩니다.
* 4) 객체의 소멸은 IoC컨테이너가 종료되면 소멸합니다.
*/
import kr.co.ezen.beans.TestBean4;

public abstract class mainClass{

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("kr/co/ezen/config/beans.xml");
		
	
		//프로토타입이라서 같은거지만 주소값은 다름

		
		TestBean3 t3 = context.getBean("t3", TestBean3.class);
		System.out.println("t3 = " + t3);
		
		System.out.println("================================================");
		
		TestBean4 t4 = context.getBean("t4", TestBean4.class);
		System.out.println("t4 = " + t4);
		
		context.close();
		
	}
}
