package com.deltadirac.sandbox;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.deltadirac.sandbox.student.Student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootSandboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSandboxApplication.class, args);
	}

	@GetMapping
	public List<Student> hello() {
		return List.of(
			new Student(1L, "Dedi", "dedi@mail.com", LocalDate.of(1997, Month.JUNE, 27), 23),
			new Student(1L, "Prakasa", "prakasa@mail.com", LocalDate.of(2019, Month.JUNE, 7), 23)
		);
	}

}
