package com.ezen.springbasic.core;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
//@Component	
public class Sword implements Weapon {

	@Override
	public void attack() {
		log.info("장검으로 공격합니다.");
		
	}

}
