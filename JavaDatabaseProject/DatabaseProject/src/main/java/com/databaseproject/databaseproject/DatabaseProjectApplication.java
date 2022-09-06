package com.databaseproject.databaseproject;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseProjectApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(EmployeeRepository repository){
        return (args ->{
            insertJavaAdvocates(repository);
            System.out.println(repository.findAll());
//            System.out.println(repository.findEmployeeByLastNameContaining(str, " "));
        } );
    }

    private void insertJavaAdvocates(EmployeeRepository repository){
        repository.save(new Employee("bharat", "Katyal"));
        repository.save(new Employee("Trisha", "Gee"));
        repository.save(new Employee("Sam", "Smith"));
        repository.save(new Employee("Will", "Smith"));
        repository.save(new Employee("James", "Henry"));





    }

}
