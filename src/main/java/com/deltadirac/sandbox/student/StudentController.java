package com.deltadirac.sandbox.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {

    @GetMapping
	public List<Student> hello() {
		return List.of(
			new Student(1L, "Dedi", "dedi@mail.com", LocalDate.of(1997, Month.JUNE, 27), 23),
			new Student(1L, "Prakasa", "prakasa@mail.com", LocalDate.of(2019, Month.JUNE, 7), 23)
		);
	}
}
