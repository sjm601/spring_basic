package com.ezen.springbasic.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SpringApplication {

	public static void main(String[] args) {
		ApplicationContext springContainer = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		log.info("생성된 스프링 컨테이너 : {}",springContainer);
		//이름으로 조회하는 방법
//		Unit unit =(Unit) springContainer.getBean("unit");
		// 타입으로 조회하는 방법
//		Unit unit =springContainer.getBean(Unit.class);
		// 타입&이름 모두 사용하여 조회하는 방법
		Unit unit =springContainer.getBean("unit",Unit.class);
		
		// 스프링 컨테이너에 등록된 모든 빈 검색
		int count=springContainer.getBeanDefinitionCount();
		log.info("등록된 개수 :{}",count);
		
		String [] names = springContainer.getBeanDefinitionNames();
		for (String beanName : names) {
			Object bean =springContainer.getBean(beanName);
			log.info("빈 : {}",bean);
		}
		
		unit.offense();		
	
		// 스프링 컨테이너는 빈을 싱글톤으로 관리한다.
//		Unit unit2 = springContainer.getBean("marine",Unit.class);
//		log.info("주소값 비교 : {}",unit == unit2);
	}

}
