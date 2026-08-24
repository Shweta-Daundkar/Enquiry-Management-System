package com.demo.service;

import java.util.List;

import com.demo.model.Enquiry;

public interface EnquiryService {
	
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
	
	int deleteById(int id);


}
