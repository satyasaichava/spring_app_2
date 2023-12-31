package pack.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import pack.base.security.AppSecurity;

@Configuration
public class AppConfig {
	public AppConfig() {
		System.out.println("Application Configuration :: Executed");
	}

    @Bean
    AppSecurity createObject() {
		return new AppSecurity();
	}
}
