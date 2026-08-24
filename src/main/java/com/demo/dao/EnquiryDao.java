package com.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.model.Enquiry;

@Repository
public interface EnquiryDao extends JpaRepository<Enquiry, Integer> {
	
	List<Enquiry> findAll();
	
	Enquiry findById(int id);
	
	List<Enquiry>findByName(String name);
	
	List<Enquiry>findByEmail(String email);
	
	List<Enquiry>findByPhone(String phone);
	
	List<Enquiry>findByCountry(String country);
	
	List<Enquiry>findByProduct(String product);
	
	List<Enquiry>findByQuantity(double quantity);
	
	List<Enquiry>findByMessage(String message);
	
	Enquiry save(Enquiry e);
	
	@Query(value = "delete from Enquiry where id=?1",nativeQuery = true)
	@Modifying
	int deleteById(int id);
	

}


