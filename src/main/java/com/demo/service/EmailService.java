package com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.demo.model.Enquiry;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSender;
	public void sendEnquiryEmail(Enquiry enquiry) {
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setTo("daundkarshweta45@gmail.com");
		message.setSubject("New enquiry Received - Swanora Global");
		
		 message.setText(
	                "New enquiry received.\n\n"
	                + "Name : " + enquiry.getName()
	                + "\nEmail : " + enquiry.getEmail()
	                + "\nPhone : " + enquiry.getPhone()
	                + "\nCountry : " + enquiry.getCountry()
	                + "\nProduct : " + enquiry.getProduct()
	                + "\nQuantity : " + enquiry.getQuantity()
	                + "\nMessage : " + enquiry.getMessage()
	        );
		 
		 mailSender.send(message);
		
	}

}
