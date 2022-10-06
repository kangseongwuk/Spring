
public class summury {

	public static void main(String[] args) {
		int sum = 100 + 500;
		System.out.println("Adder: " + sum);

	}

}


/* 
 * Spring (2003.2월 Expert one-on-one J2EE Design and Development 라는 책을 통하여 오픈소스 형태로 시작
 * 		   2008년경 탄생=로드존슨, 2013년 11월 중순경 채택 => 전자정부 프레임워크로 사용하기 시작 (뼈대가 Spring))
 * -핵심 계층
 * 	1)프리젠테이션 계층 : SpringFramework
 * 					-사용자 인터페이스 역할
 * 					-브라우저상에서 클라이언트의 요청 및 응답을 처리
 * 					-서비스 계층, 데이터 엑세스 계층에서 발생하는 예외상황을 처리
 * 					-@controller를 사용하여 처리한다.
 * 
 * 	2)제어 계층 : 프리젠테이션 계층과 비지니스 로직 계층을 분리하기 위하여 컨트롤러를 제공한다.
 * 
 * 	3)비지니스 로직(service) 계층 : 핵심 업무를 어떻게 처리하는가를 보여주는 방법이 기술된 계층
 * 					-애플리케이션의 비지니스 로직 처리와 관련된 도메인 모델의 적합성(validation) 검증
 * 					-Transaction 관리
 * 					-Service 인터페이스와 @Service 사용하여 Service class를 구현
 * 					-프리젠테이션 계층과 persistence (DAO) 계층을 연결하는 역할을 하는데, 이는 두 계층이 직접적으로 통신하지 않도록
 * 					 하는것이 이유
 * 						두 계층이 직접 통신하지 않는 이유)	  1. 코드의 재사용성
 * 													  2. 유지보수의 편리성
 * 												      3. 확장성
 *  
 * 	4)Persistence(DAO) 퍼시턴스 계층 : 데이터 처리를 담당(DB CRUD), DTO = VO
 * 					- ORM library를 사용 ( MyBatis, Hibernate 등)을 주로 사용하는 계층
 * 					- DAO 인터페이스와 @Repository을 사용하여 DAO class를 구현
 * 					- DataBase에 CRUD하는 계층
 * 
 * 	5)도메인 모델 계층 : 각 계층 사이에 전달되는 파라메터(객체)-어디에 담아서 처리한다.
 * 		-DB의 테이블과 같다.
 * 		-테이블과 매칭되는 클래스가 존재
 * 		-Entity class
 * 
 * 	.MVC Pattern
 * 		MVC(M: model, V: view, C : controller)
 * 		: 사용자 인터페이스와 애플리케이션 로직을 분리하기 위하여
 * 		1) MODEL : 모델 컴포넌트
 * 				시스템의 비지니스 로직을 포함하고, 애플리케이션의 상태를 나타내는 데이터 계층
 * 				프리젠테이션 레이어와 무관하며, 컨트롤러는 모델 레이어에서 데이터를 가져다가 뷰 레이어로 전달합니다.
 * 				=> VO(DTO), DAO(=DAO class), service class에 해당.
 * 
 * 		2) VIEW : 뷰 컴포넌트
 * 				UI형식의 응용 프로그램 출력을 표시합니다.
 * 				모델이 처리한 데이터나 그 작업 결과를 가지고 사용자에게 출력할 화면을 만드는 일을 한다.
 * 
 * 		3) CONTROLLER 컴포넌트
 * 				view와 model간의 인터페이스 역할
 * 
 * 		.SPRING MVC 주요 구성 요소
 * 			1)브라우저 요청
 * 			2)서블릿이 핸들러 매핑에게 전달
 * 			3)핸들러 매핑이 어떤 컨트롤러가 처리할지를 결정해서 서블릿에게 전달
 * 			4)서블릿은 전달받아서 해당 컨트롤러에게 전달
 * 			5)컨트롤러는 이를 처리......
 * 			6)결과를 모델and뷰에게 전달
 * 			7)모델앤뷰는 다시 서블릿에게
 * 			8)서블릿은 다시 view Rosolver에게 전달
 * 			9)뷰리졸버는 다시 서블릿에게
 * 			10)서블릿은 뷰에게
 * 			11)뷰는 브라우저에게 결과를 전달
 * 
 * 		.Maven : 스프링 프레임워크 라이브러리 관리 하기 위하여 사용
 * 			- 라이브러리 의존성
 * 			- 자동화 시키기에 편리함
 * 			
 * 	===========================================================================================================			
 */

/* IoC
 * - Inversion of Control : 개발자가 코드 등의 흐름이나 객체 생성에 관련된 코드를 프로그래밍에 직접
작성하는 것이 아니라, 프레임워크가 사용하는 파일에 작성하여 이를 토대로 프레임워크가 객체를 생성하고, 
반환하고, 코드가 동작하는 순서를 결정하는 것을 의미합니다.

-객체의 생성, 생명주기의 관리까지 모든 객체에 대한 제어권을 가진다.
-IoC 컨테이너는 객체의 생성을 책임지고, 의존성을 관리합니다.
-POJO의 생성, 초기화, 서비스, 소멸에 대한 권한을 가지게됩니다.
-개발자들이 직접 POJO를 생성 할 수 있지만, 컨테이너에게 맡깁니다. (Bean등록=> xml파일)

-2가지 표현
1.의존성 검색 : DL(DataBase연결), Connection Pool(Server.xml), Driver
  - DL(DB연결)
      Class.forName("oracle.jdbc.OracleDriver");
      String url="jdbc:oracle:thin:@localhost:1521:xe";
      String id="hyun";
      String pw="oraclejava";
      conn = DriverManager.getConnection(url, id, pw); 
  
  - Connection Pool(server.xml, context.xml)

 Context init = new InitialContext();
		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
		conn = ds.getConnection();

  <Context> 
  <Resource name="jdbc/OracleDB" 
   auth="Container"
   type="javax.sql.DataSource" 
   username="oraclejava" 
   password="oraclejava"
   driverClassName="oracle.jdbc.driver.OracleDriver"
   factory="org.apache.tomcat.dbcp.dbcp2.BasicDataSourceFactory"
   url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
   maxActive="500" 
   maxIdle="100"/>  
</Context>


2.의존성 주입 : DI => Setter Injection, Constructor Injection, Method Injection
  각 클래스간에 의존관계를  빈 설정 정보를 바탕으로 컨테이너가 자동으로 연결해 줍니다.
 
 - 객체의 생성은 빈 등록이 아니라, getBean()를 호출함으로써 객체가 생성됩니다. 

-종류
1)BeanFactory : 3.X주로 사용
 -클래스를 통하여 객체를 생성하고, 이를 전달합니다.
 -상속 등 객체간의 관계를 형성하고 관리합니다.
    <종류>
	ApplicationEventPublisher, ListableBeanFactory, MessageSource, 
	ResourceLoader  ... 
 -xmlBeanFactory 

2)ApplicationContext
 - BeanFactory 상속받아 기본적인 컨테이너 기능 + 확장 기능 제공
 - 확장한 기능 : 메시지 소스 처리 기능, 이벤트 발행기능, 리소스 로딩 기능, 트랜잭션 관리 등등..
   컨테이너의 구동되는 시점에 bean에 등록되어 있는 클래스를 객체화하는 즉시 로딩 방식.
 -클래스를 통하여 객체를 생성하고, 이를 전달합니다.
 -상속 등 객체간의 관계를 형성하고 관리합니다.
 -국제화 지원 등 문자열에 대한 다양한 기능을 제공합니다.
 -리스너로 등록되어 있는 Bean에 이벤트를 발생할 수 있다.
 -Bean에 관련한 설정을 위한 xml 파일은 즉시 로딩되어서 객체를 미리 생성하여 가지게 됩니다.
     <종류>
	StaticApplicationContext, genericXmlApplicationContext, WebApplicationContext,
	XmlWebApplicationContext ...
 -ClassPathXmlApplicationContext
 -FileSystemXmlApplicationContext
 -XmlWebApplicationContext
 * 
 * ====================================================================================================
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
 * 
 * ==============================================================================================================
 * 
 * BeanPostProcessor
 * ---------------------------------------------
 * -Bean 객체를 정의할 때 init-method 속성을 설정하면 객체가 생성될 때 자동으로 호출될 메소드를 지정할 수 있습니다.
 * -이때, BeanPostProcessor 인터페이스를 구현한 클래스를 정의하면 Bean 객체를 생성 할 때
 * 	호출되는 init 메소드 호출을 가로채어 다른 메소드를 호출 할 수 있습니다.
 * -postProcessBeforeInitialization : init-method에 지정된 메소드가 호출되기 전에 호출 합니다.
 * -postProcessAfterInitialization : init-method에 지정된 메소드가 호출된 다음에 호출 합니다.
 * -init-method가 지정되어 있지 않더라도 자동으로 호출합니다.
 */