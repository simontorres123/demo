package com.example.demo.service;

import com.example.demo.dao.Personrepository;
import com.example.demo.model.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceImplTest {

    private Personrepository personrepository;

    @BeforeEach
    void setUp() {
        personrepository = Mockito.mock(Personrepository.class);
        List<Person> p = getPerson();
        Mockito.when(personrepository.findAll()).thenReturn(p);
        Person mockPerson = new Person();
        mockPerson.setName("Simon");
        Mockito.when(personrepository.save(Mockito.any())).thenReturn(mockPerson);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findAll() {
        assertEquals(personrepository.findAll().get(0).getName(),"kevin");
    }

    @Test
    void createPerson(){
        assertEquals("Simon",personrepository.save(new Person()).getName());

    }

    private List<Person> getPerson(){
        Person p = new Person();
        p.setName("kevin");
        p.setLastname("Aviña");
       return Arrays.asList(p);
    }
}