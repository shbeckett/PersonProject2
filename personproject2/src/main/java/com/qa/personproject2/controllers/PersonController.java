package com.qa.personproject2.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.personwithentities.Person;

@RestController
public class PersonController {

    public PersonController() {
    }
    public ArrayList<Person> people;

    @GetMapping(@path = "/{id}", produces = "application/json")
	public Person getPerson(@PathVariable int id){
        return findPersonById(id;)
    }
    @GetMapping("/")
	public ArrayList getPeople(){
        return people;
    }
    @GetMapping("/getAll")
    public List<Person> getAll() {
        return this.people;
    }	
	}