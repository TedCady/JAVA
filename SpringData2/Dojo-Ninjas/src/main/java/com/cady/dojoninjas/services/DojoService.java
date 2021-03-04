package com.cady.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cady.dojoninjas.model.Dojo;
import com.cady.dojoninjas.repositories.DojoRepo;

@Service
public class DojoService {
	private final DojoRepo repo;
	
	public DojoService(DojoRepo repo) {
		this.repo = repo;
	}
	
	public List<Dojo> allDojos(){
		return repo.findAll();
	}
	
	public Dojo createDojo(Dojo L) {
		return repo.save(L);
	}
	
	public Dojo findDojo(Long id) {
		Optional<Dojo> L = repo.findById(id);
		if(L.isPresent()) {
			return L.get();
		}else {
			return null;
		}
	}
	
	public Dojo updateDojo(Dojo L) {
		Dojo L1 = findDojo(L.getId());
		L1 = L;
		return repo.save(L1);
	}
	
	public void deleteDojo(Long id) {
		repo.deleteById(id);
	}
	
}
