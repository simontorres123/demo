package com.example.demo.model;

import com.example.demo.controller.HelloWorldController;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;


@Entity
@Table(name = "PERSON")
public class Person{
    @Id
    @Column(name = "name")
    private String name;
    @Column(name = "lastname")
    private String lastname;
    //private List<Address> adressList;

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

}