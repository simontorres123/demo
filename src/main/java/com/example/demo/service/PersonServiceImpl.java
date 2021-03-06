package com.example.demo.service;

import com.example.demo.dao.Personrepository;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service(value = "personService")
public class PersonServiceImpl implements PersonService{


    @Autowired
    private Personrepository personrepository;

    @Override
    public Person createPerson(Person person){
        return personrepository.save(person);
    }

    @Override
    public List<Person> findAll() {
        return personrepository.findAll();
    }

    @Override
    public List<Person> findByLastName(String lastName){
       return personrepository.getAllByLastname(lastName);
    }
}
