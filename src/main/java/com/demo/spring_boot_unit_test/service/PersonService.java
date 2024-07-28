package com.demo.spring_boot_unit_test.service;

import com.demo.spring_boot_unit_test.entity.Person;
import com.demo.spring_boot_unit_test.repository.PersonRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Mertcan Özarslan
 */

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person> getAllPerson()
    {
        return personRepository.findAll();
    }
}
