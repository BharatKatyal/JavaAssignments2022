package com.bharatkatyal.springdatajpa;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }
    @Bean
    public CommandLineRunner run(MembersRepository repository) {
        return (args -> {
            insertJavaAdvocates(repository);
            System.out.println(repository.findAll());
            System.out.println(repository.findAllByActiveFalse());
//            System.out.println(repository.findEmployeeByLastNameContaining("a"));
        });
    }
//    public CommandLineRunner run(EventRepository repository) {
//        return (args -> {
//            insertJavaAdvocates(repository);
//            System.out.println(repository.findAll());
//            System.out.println(repository.findAllByEventNameIsContaining("Intro"));
////            System.out.println(repository.findEmployeeByLastNameContaining("a"));
//        });
//    }
    private void insertJavaAdvocates(MembersRepository repository) {
        repository.save(new Members("THIS IS A ", "TEST", true));
        repository.save(new Members("Trisha", "Gee", null));
        repository.save(new Members("Sam", "Smith", false));
        repository.save(new Members("Will", "Smith", true));
        repository.save(new Members("James", "Henry", null));
        repository.save(new Members("Samanth a", "Smith", true));
    }
//    private void insertJavaAdvocates(EventRepository repository) {
//        repository.save(new Event("This is a Test ", "Testing ", "Test Room 222"));
//
//        repository.save(new Event("Intro To Tech Club", "01-01-2023", "EastCampus Room 222"));
//        repository.save(new Event("First Meeting", "01-10-2023", "EastCampus Room 222"));
//
//
//    }
}
