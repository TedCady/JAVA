package com.cady.pnc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cady.pnc.models.Product;

@Repository
public interface PRepo extends CrudRepository<Product, Long>{
	List<Product> findAll();
//	Long countByNameContaining();
}
