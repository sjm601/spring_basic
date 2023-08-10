package com.ezen.springbasic;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ezen.springbasic.guestbook.Guestbook;
import com.ezen.springbasic.guestbook.GuestbookService;

@SpringBootTest
public class GuestbookServiceTest {
	
	@Autowired
	GuestbookService guestbookService;
	
	@Test
	@Disabled
	void registTest() {
		//given
		Guestbook guestbook=Guestbook.builder()
			.writer("다비드 라야")
			.message("아스날에 입단하게 되어서 기쁩니다")
			.build();
		guestbookService.register(guestbook);
	}
	
	@Test
	void findAllTest() {
		List<Guestbook> list = 	guestbookService.findGuestbooks();
		for (Guestbook guestbook : list) {
			System.out.println(guestbook);
		}
	}

}
