package com.in28minutes.springboot.jdbc.h2.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.in28minutes.springboot.jdbc.h2.example.student.Friend;
import com.in28minutes.springboot.jdbc.h2.example.student.StudentJdbcRepository;

@SpringBootApplication
public class SpringBoot2JdbcWithH2Application implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	StudentJdbcRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot2JdbcWithH2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Friend id 10001 -> {}", repository.findById(10001L));

		logger.info("Inserting -> {}", repository.insert(new Friend(10010L,"Ankush@gmail.com","10001,10002")));

		logger.info("Update 10003 -> {}", repository.update(new Friend(10001L,"newgmail.com","10010")));

		repository.deleteById(10002L);

		logger.info("All users -> {}", repository.findAll());
	}
}
