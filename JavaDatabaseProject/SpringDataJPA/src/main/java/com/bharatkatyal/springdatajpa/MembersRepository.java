package com.bharatkatyal.springdatajpa;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MembersRepository extends CrudRepository<Members, Long> {
//    List<Members> findAllByActiveContains(Boolean active);
    List<Members> findAllByActiveFalse();
//    List<Employee> findEmployeeByLastNameContaining(String str);
}