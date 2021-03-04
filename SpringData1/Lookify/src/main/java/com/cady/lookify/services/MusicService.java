package com.cady.lookify.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cady.lookify.models.MusicModel;
import com.cady.lookify.repositories.MusicRepo;

@Service
public class MusicService {
	private final MusicRepo repo;
	
	public MusicService(MusicRepo repo) {
		this.repo = repo;
	}
	
	public List<MusicModel> allMusic(){
		return repo.findAll();
	}
	
	public MusicModel createMusic(MusicModel M) {
		return repo.save(M);
	}
	
	public MusicModel findMusic(Long id) {
		Optional<MusicModel> M = repo.findById(id);
		if(M.isPresent()) {
			return M.get();
		}else {
			return null;
		}
	}
	
	public MusicModel updateMusic(MusicModel M) {
		return repo.save(M);
	}
	
	public void deleteMusic(Long id) {
		repo.deleteById(id);
	}
	
	public List<MusicModel> findCreator(String c){
		List<MusicModel> creator = repo.findByCreatorContaining(c);
		return creator;
	}
}
