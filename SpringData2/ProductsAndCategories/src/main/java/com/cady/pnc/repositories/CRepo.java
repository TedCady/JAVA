package com.cady.pnc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cady.pnc.models.Category;

@Repository
public interface CRepo extends CrudRepository<Category, Long> {
	List<Category> findAll();
//	Long countByNameContaining(String search);

}
