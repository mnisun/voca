package com.word.voca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class}) // 데이터베이스 설정이 안되어 프로젝트 실행이 안되기 때문에 추가해준다.
public class VocaApplication {

	public static void main(String[] args) {

		SpringApplication.run(VocaApplication.class, args);
	}

}
