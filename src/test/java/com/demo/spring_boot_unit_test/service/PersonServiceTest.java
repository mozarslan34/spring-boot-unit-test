package com.demo.spring_boot_unit_test.service;

import com.demo.spring_boot_unit_test.entity.Person;
import com.demo.spring_boot_unit_test.repository.PersonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

/**
 * @author Mertcan Özarslan
 */

@ExtendWith(MockitoExtension.class)
class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    @Test
    void getAllPersons() {
        Person person1= new Person( 1,"Ahnis","Gotham");
        Person person2= new Person(2,"Saksham","New york");

        when(personRepository.findAll()).thenReturn(List.of(person1,person2));
        var  personList = personService.getAllPerson();
        assertThat(personList).isNotNull();
        assertThat(personList.size()).isEqualTo(2);

    }

    @Test
    void getPersonById() {
        Person person1= new Person(1,"Ahnis","Gotham");
        when(personRepository.findByPersonId(1)).thenReturn(person1);
        Person result = personService.getById(1);
        assertThat(result).isNotNull();
        assertThat(result.getPersonId()).isEqualTo(1);
        assertThat(result.getPersonName()).isEqualTo("Ahnis");
        assertThat(result.getPersonCity()).isEqualTo("Gotham");
    }
}
