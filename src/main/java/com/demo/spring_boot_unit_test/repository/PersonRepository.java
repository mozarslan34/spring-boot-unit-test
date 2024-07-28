package com.demo.spring_boot_unit_test.repository;

import com.demo.spring_boot_unit_test.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Mertcan Özarslan
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

    boolean existsById(Integer id);

    Person findByPersonId(int id);
}
