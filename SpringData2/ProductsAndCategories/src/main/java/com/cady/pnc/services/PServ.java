package com.cady.pnc.services;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cady.pnc.models.Product;
import com.cady.pnc.repositories.PRepo;



@Service
public class PServ {
	private final PRepo repo;
	 
//	REPO
	 
	public PServ(PRepo repo) {
	     this.repo = repo;
	 }
	 
//	CREATE
	 
	 public void create(Product obj) {
	     repo.save(obj);
	 }
	 
//	RETRIEVE
	 
	 public Product retrieve(Long id) {
	     Optional<Product> obj = repo.findById(id);
	     if(obj.isPresent()) {
	         return obj.get();
	     } else {
	         return null;
	     }
	 }

//	RETRIEVE ALL
		
	 public List<Product> retrieveAll() {
		 List<Product> p = repo.findAll();
	     return p;
	 }
	 
//	UPDATE
	 
	 public Product update(Product obj) {
		 Product obj1 = retrieve(obj.getId());
		 obj1 = obj;
		 return repo.save(obj1);
	 }
	 
//	DELETE
	 
	 public void delete(Long id) {
		 repo.deleteById(id);		 
	 }
}