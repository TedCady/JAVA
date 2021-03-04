package com.cady.drivers.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cady.drivers.models.License;


@Repository
public interface LicenseRepo extends CrudRepository<License, Long>{

	List<License> findAll();
	List<License> findTopByOrderByNumberDesc();
	
	
}


