package com.cady.drivers.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cady.drivers.models.License;
import com.cady.drivers.repositories.LicenseRepo;





@Service
public class LicenseService {
	private final LicenseRepo repo;
	
	public LicenseService(LicenseRepo repo) {
		this.repo = repo;
	}
	
	public List<License> findAll(){
		return repo.findAll();
	}
	
	public License createLicense(License license) {
		return repo.save(license);
	}
	public Optional<License> getLicense(Long id) {
		return repo.findById(id);
	}
	public static int licenseNumber;

	public static int getLicenseNumber() {
		return licenseNumber;
	}

	public static void setLicenseNumber(int licenseNumber) {
		LicenseService.licenseNumber = licenseNumber;
	}
	public String stringLicenseNumber(int num) {
		String format = String.format("%06d", num);
		return format;
	}
	 public String generateLicenseNumber() {
		 if(repo.findTopByOrderByNumberDesc().isEmpty()) {
			 licenseNumber += 1;
			 return stringLicenseNumber(licenseNumber);
		 }else {
			 List<License> top = repo.findTopByOrderByNumberDesc();
			 licenseNumber = 1+(Integer.parseInt(top.get(0).getNumber()));
			 return stringLicenseNumber(licenseNumber);
		 }
	 }
}
