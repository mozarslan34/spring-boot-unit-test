package com.demo.spring_boot_unit_test.controller;

import com.demo.spring_boot_unit_test.entity.Person;
import com.demo.spring_boot_unit_test.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Mertcan Özarslan
 */
@RestController
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<List<Person>> getAllPersons() {
        return ResponseEntity.ok(personService.getAllPerson());
    }


    @GetMapping("/person")
    public ResponseEntity<Person> getPerson(@RequestParam Integer id) {
        return ResponseEntity.ok(personService.getById(id));
    }
}
