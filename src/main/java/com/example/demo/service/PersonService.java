package com.example.demo.service;

import com.example.demo.model.Person;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PersonService {

    Person createPerson(Person person);
    List<Person> findAll();
    List<Person> findByLastName(String lastName);
}
