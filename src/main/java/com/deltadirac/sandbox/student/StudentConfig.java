package com.deltadirac.sandbox.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class StudentConfig {
    
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student dedi = new Student("Dedi", "dedi@mail.com", LocalDate.of(1997, Month.JUNE, 27), 24);
            Student prakasa = new Student("Prakasa", "prakasa@mail.com", LocalDate.of(1997, Month.JULY, 26), 24);

            repository.saveAll(List.of(dedi, prakasa));
        };
    }
}
