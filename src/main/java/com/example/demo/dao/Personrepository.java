package com.example.demo.dao;

import com.example.demo.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface Personrepository extends JpaRepository<Person,String> {

    @Query(value = "Select p from Person p where p.lastname = :lastName")
    List<Person> getAllByLastname(@Param("lastName") String lastName);
}
