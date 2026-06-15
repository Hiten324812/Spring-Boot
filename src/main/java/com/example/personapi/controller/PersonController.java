package com.example.personapi.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.personapi.model.Person;
import com.example.personapi.service.PersonService;

import java.util.*;

@RestController
@RequestMapping("/api")
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping
    public ResponseEntity<Object> getAllPersons() {
      List <Person> result =  this.personService.fetchAll();

      return ResponseEntity.ok(result);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Object> getById(@PathVariable int id)
    {
     List <Person> result = this.personService.getById(id);

      return ResponseEntity.ok(result);
    }

    @GetMapping("/name/{name}")
    public ResponseEntity<Object> getByName(@PathVariable String name)
    {
        
        List <Person> result = this.personService.getByName(name);

        return ResponseEntity.ok(result);


    }

    @GetMapping("/total")
    public Double getTotal()
    {
        return this.personService.getTotal();
    }

    @GetMapping("/name")
    public ResponseEntity<Object> getNameUpperCase()
    {
        List<String> result = this.personService.getNameUpperCase();

      return ResponseEntity.ok(result);

    }

    @GetMapping("/getCountCity")
    public ResponseEntity<Object> getCityCount()
    {
       return ResponseEntity.ok(this.personService.getCountCity());
    }

    @GetMapping("/joinString")
    public ResponseEntity<Object> getJoinString()
    {
         return ResponseEntity.ok(this.personService.Joined());
    }
  
}
