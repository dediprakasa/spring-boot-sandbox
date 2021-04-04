package com.deltadirac.sandbox.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {
    
    public List<Student> getStudents() {
        return List.of(
			new Student(1L, "Dedi", "dedi@mail.com", LocalDate.of(1997, Month.JUNE, 27), 23),
			new Student(1L, "Prakasa", "prakasa@mail.com", LocalDate.of(2019, Month.JUNE, 7), 23)
		);
    }
}
