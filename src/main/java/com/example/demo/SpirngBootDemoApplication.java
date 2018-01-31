package com.example.demo;

import com.example.demo.common.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.session.web.http.DefaultCookieSerializer;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class SpirngBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpirngBootDemoApplication.class, args);
	}

	@Bean
	public DefaultCookieSerializer cookieSerializer(){
		DefaultCookieSerializer cookie = new DefaultCookieSerializer();
		cookie.setCookieName("springboot_id");
		return cookie;
	}
	@Bean
	public PageInterceptor pageInterceptor(){
		return new PageInterceptor();
	}
}
