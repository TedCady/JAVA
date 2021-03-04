package com.cady.drivers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cady.drivers.models.Person;
import com.cady.drivers.repositories.PersonRepo;




@Service
public class PersonService {
	private final PersonRepo repo;
	
	public PersonService(PersonRepo repo) {
		this.repo = repo;
	}
	
	public List<Person> findAll(){
		return repo.findAll();
	}
	
	public Person createPerson(Person person) {
		return repo.save(person);
	}
	 public Optional<Person> findById(Long id) {
	        return repo.findById(id);
	    }

}
