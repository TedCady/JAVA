package com.cady.pnc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cady.pnc.models.Category;
import com.cady.pnc.repositories.CRepo;



@Service
public class CServ {
	private final CRepo repo;

//	REPO
	 
	public CServ(CRepo repo) {
	     this.repo = repo;
	 }
	 
//	CREATE
	 
	 public Category create(Category obj) {
	     return repo.save(obj);
	 }
	 
//	RETRIEVE
	 
	 public Category retrieve(Long id) {
	     Optional<Category> obj = repo.findById(id);
	     if(obj.isPresent()) {
	         return obj.get();
	     } else {
	         return null;
	     }
	 }

//	RETRIEVE ALL
		
	 public List<Category> retrieveAll() {
	     return repo.findAll();
	 }
	 
//	UPDATE
	 
	 public Category update(Category obj) {
		 Category obj1 = retrieve(obj.getId());
		 obj1 = obj;
		 return repo.save(obj1);
	 }
	 
//	DELETE
	 
	 public void delete(Long id) {
		 repo.deleteById(id);		 
	 }

}
