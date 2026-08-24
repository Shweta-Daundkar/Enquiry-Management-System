package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Enquiry;
import com.demo.service.EnquiryService;

@RestController
public class EnquiryController {
	
	@Autowired
	private EnquiryService es;
	
	@GetMapping(value = "/")
	public List<Enquiry> m1(){
		return es.findAll();
	}
	
	@GetMapping(value = "/findbyid/{id}")
	public Enquiry m2(@PathVariable int id){
		return es.findById(id);
	}
	
	@GetMapping(value = "/findbyname/{s1}")
	public List<Enquiry> m3(@PathVariable String s1){
		return es.findByName(s1);
	}
	
	@GetMapping(value = "/findbyemail/{email}")
	public List<Enquiry> m4 (@PathVariable String email){
		return es.findByEmail(email);
	}
	
	@GetMapping(value = "/findbyphone/{phone}")
	public List<Enquiry> m5(@PathVariable String phone){
		return es.findByPhone(phone);
	}
	
	@GetMapping(value = "/findbycountry/{country}")
	public List<Enquiry> m6(@PathVariable String country){
		return es.findByCountry(country);
	}
	
	@GetMapping(value = "/findbyproduct/{product}")
	public List<Enquiry> m7(@PathVariable String product){
		return es.findByProduct(product);
	}
	
	@GetMapping(value = "/findbyquantity/{quantity}")
	public List<Enquiry> m8(@PathVariable double quantity){
		return es.findByQuantity(quantity);
	}
	
	@GetMapping(value = "/findbymessage/{message}")
	public List<Enquiry> m9(@PathVariable String message){
		return es.findByMessage(message);
	}
	
	@PostMapping("/save")
	public Enquiry m10(@RequestBody Enquiry e) {
	    return es.save(e);
	}
		
	@DeleteMapping(value = "/deletebyid/{id}")
	public int m11(@PathVariable int id) {
		return es.deleteById(id);
	}
	
}
