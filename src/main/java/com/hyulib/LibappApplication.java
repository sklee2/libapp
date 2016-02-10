package com.hyulib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibappApplication
//		implements CommandLineRunner
{
//	@Autowired
//	PasswordCompareDao passwordCompareDao;
//
//	@Override
//	public void run(String... strings) throws Exception{
//
//		String userId=passwordCompareDao.passwordCompare("000A011982", "FRl89yFLWOZ8rlZeVz/9mqRLy4H47l1xhd/o2goW70M=");
//
////		System.out.println(userId);
//
//	}

	public static void main(String[] args) {
		SpringApplication.run(LibappApplication.class, args);
	}
}
