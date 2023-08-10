package com.ezen.springbasic.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * 애플리케이션에 관계된 구현 객체 생성 및 관계 설정을 책임지는 별도의 조립 클래스 작성
 */
//설정 정보 없어도 자동으로 스프링 객체(빈)를 생성하고 등록하는 스프링 컴포넌트 스캔 기능과 의존관계 자동 주입을 지원한다.
//@Configuration
@ComponentScan(basePackages = "com.ezen.springbasic")
public class ApplicationConfig {
	
//	@Bean
//	public Weapon weapon() {
////		return new Gun();
//		return new Sword();
//	
//	}
//	@Bean
//	public Unit unit() {
//		return new Marine(weapon());
//	}
	
	
}
