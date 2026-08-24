package com.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.EnquiryDao;
import com.demo.model.Enquiry;

@Service
@Transactional
public class EnquiryServiceImpl implements EnquiryService{
	
	@Autowired
	private EnquiryDao ed;
	
	@Autowired
	private EmailService emailService;

	@Override
	public List<Enquiry> findAll() {
		return ed.findAll();
	}
	
	@Override
	public Enquiry findById(int id) {
		return ed.findById(id);
	}

	@Override
	public List<Enquiry> findByName(String name) {
		return ed.findByName(name);
	}

	@Override
	public List<Enquiry> findByEmail(String email) {
		return ed.findByEmail(email);
	}

	@Override
	public List<Enquiry> findByPhone(String phone) {
		return ed.findByPhone(phone);
	}

	@Override
	public List<Enquiry> findByCountry(String country) {
		return ed.findByCountry(country);
	}

	@Override
	public List<Enquiry> findByProduct(String product) {
		return ed.findByProduct(product);
	}

	@Override
	public List<Enquiry> findByQuantity(double quantity) {
		return ed.findByQuantity(quantity);
	}

	@Override
	public List<Enquiry> findByMessage(String message) {
		return ed.findByMessage(message);
	}
	
	@Override
	public Enquiry save(Enquiry e) {

	    // Save enquiry to database
	    Enquiry savedEnquiry = ed.save(e);

	    // Send email
	    emailService.sendEnquiryEmail(savedEnquiry);

	    return savedEnquiry;
	}

	@Override
	public int deleteById(int id) {
		return ed.deleteById(id);
	}
	
	

}
