package com.cady.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cady.lookify.models.MusicModel;

@Repository
public interface MusicRepo extends CrudRepository<MusicModel, Long>{
	List<MusicModel> findAll();
	List<MusicModel> findByCreatorContaining(String search);

}
