package com.ezen.springbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.ezen.springbasic.core.Unit;

@SpringBootApplication
public class SpringBasicApplication {

	public static void main(String[] args) {
		// 스프링 컨테이너 생성
		ConfigurableApplicationContext springContainer=SpringApplication.run(SpringBasicApplication.class, args);
		System.out.println("스프링 컨테이너 생성 완료...");
		Unit unit =springContainer.getBean("unit",Unit.class);
		unit.offense();
	}

}
