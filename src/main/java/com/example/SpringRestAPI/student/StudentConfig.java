package com.example.SpringRestAPI.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
    return args -> {
        Student fazliddin = new Student(
                "Fazliddin",
                "fazikacme@gmail.com",
                LocalDate.of(1999, Month.FEBRUARY, 19)
        );
        Student ibodullaev = new Student(
                "Ibodullaev",
                "ifazliddin@icloud .com",
                LocalDate.of(1999, Month.FEBRUARY, 19)
                );
        repository.saveAll(List.of(fazliddin, ibodullaev));
    };
}
}
