package com.cady.dojoninjas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cady.dojoninjas.model.Ninja;
import com.cady.dojoninjas.repositories.NinjaRepo;

@Service
public class NinjaService {
	private final  NinjaRepo repo;
	
	public NinjaService(NinjaRepo repo) {
		this.repo = repo;
	}
	
	public List<Ninja> allNinjas(){
		return repo.findAll();
	}
	
	public Ninja createNinja(Ninja L) {
		return repo.save(L);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> L = repo.findById(id);
		if(L.isPresent()) {
			return L.get();
		}else {
			return null;
		}
	}
	
	public Ninja updateNinja(Ninja L) {
		Ninja L1 = findNinja(L.getId());
		L1 = L;
		return repo.save(L1);
	}
	
	public void deleteNinja(Long id) {
		repo.deleteById(id);
	}
	
	public List<Ninja> ninjaByDojo(Long id){
		List<Ninja> ninjas = repo.findByDojoId(id);
		return ninjas;
	}
	
}
