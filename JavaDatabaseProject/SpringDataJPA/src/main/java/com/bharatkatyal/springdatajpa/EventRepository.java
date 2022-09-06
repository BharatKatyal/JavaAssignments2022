package com.bharatkatyal.springdatajpa;

import org.springframework.data.repository.CrudRepository;

import java.util.List;



public interface EventRepository extends CrudRepository<Event, Long> {
    List<Event>findAllByEventNameIsContaining(String str);
//    List<Employee> findEmployeeByLastNameContaining(String str);
}
