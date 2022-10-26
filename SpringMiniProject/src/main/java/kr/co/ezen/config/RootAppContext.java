package kr.co.ezen.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import kr.co.ezen.beans.UserDataBean;

@Configuration
public class RootAppContext {

		@Bean("loginUser")
		@SessionScope
		public UserDataBean loginUserDataBean() {
			return new UserDataBean();
		}
}
