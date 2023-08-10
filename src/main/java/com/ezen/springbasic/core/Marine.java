package com.ezen.springbasic.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component("unit")
//@Scope("prototype") // get Bean  할때 항상 새로운 인스턴스를 반환하게 해준다

public class Marine implements Unit {
	
	//@Autowired 
	//@Qualifier("gun") //gun , sword 가 component로 대기하고 있기 때문에 어느것을 선택할지 정해주어야한다.
	final Weapon weapon; //final 선언을 하면 autowired를 생략할 수 있다.
	
	
	
	public Marine(Weapon weapon) {
		this.weapon = weapon;
	}
	@Override
	public void offense() {
		weapon.attack();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("빈의 초기화 메소드");
	}
}
