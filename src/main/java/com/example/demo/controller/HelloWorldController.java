package com.example.demo.controller;

import com.example.demo.model.Person;
import com.example.demo.model.PersonSoccer;
import com.example.demo.model.SoccerTeam;
import com.example.demo.service.PersonService;
import com.example.demo.service.SoccerTeamService;
import com.example.demo.webinar.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(path = "/rest")
public class HelloWorldController {

    @Autowired
    private PersonService personService;

    private SoccerTeamService soccer;

    private IServiceA serviceA;

    @Autowired
    private IServiceB serviceB;


    @Autowired
    public HelloWorldController(SoccerTeamService soccer
            ,IServiceA iServiceA){
        this.soccer=soccer;
        this.serviceA = iServiceA;
    }

   @GetMapping(value = "webinar")
    public String webinar(){
        return serviceA.getService();
    }

    @GetMapping(path = "/hello")
    public Person hello(){
        Person p = new Person();
        p.setLastname("Avina");
        p.setName("Kevin");
       /* p.setAdressList(Arrays.asList(new Address(p,725,"del arenal",27000)
                ,new Address(p,666,"calle del kevin",3000)));*/
        return p;
    }

    @PostMapping(path = "/post")
    public boolean postPerson(@RequestBody Person person){
        return !ObjectUtils.isEmpty(person);
    }

    @PostMapping(path = "/person")
    public List<Person> createPerson(@RequestBody Person person){
        personService.createPerson(person);
        return personService.findAll();
    }

    @GetMapping("/person/{lastName}")
    public List<Person> findPersonByLastName(@PathVariable String lastName){
        return  personService.findByLastName(lastName);
    }

    @GetMapping(path="/person/param")
    public List<Person> findByReuqestParam(@RequestParam Map<String,String> params){
        return personService.findByLastName(params.get("lastName"));
    }

    @GetMapping(path="/person")
    public List<Person> findByReuqestParam(){
        return personService.findAll();
    }

}
