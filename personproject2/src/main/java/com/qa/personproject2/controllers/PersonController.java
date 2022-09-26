package com.qa.personproject2.controllers;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.personproject2.entities.Person;

@RestController
public class PersonController {

    public PersonController() {
    }
    public ArrayList<Person> people;

    @GetMapping(@path = "/{id}", produces = "application/json")
	public Person getPerson(@PathVariable int id){
        return findPersonById(id);
    }
    
    @GetMapping("/testing")
    public void sayHi(){
        
    }
    @GetMapping("/")
	public ArrayList<Person> getPeople(){
        return people;
    }
    @GetMapping("/getAll")
    public List<Person> getAll() {
        return this.people;
    }	
	}