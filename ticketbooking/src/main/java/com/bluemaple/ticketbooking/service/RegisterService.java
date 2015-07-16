package com.bluemaple.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




//import com.bluemaple.ticketbooking.dao.Registration;
import com.bluemaple.ticketbooking.dao.RegistrationDAO;
//import com.bluemaple.ticketbooking.model.Book;
import com.bluemaple.ticketbooking.model.Movie;
import com.bluemaple.ticketbooking.model.User;
import com.bluemaple.ticketbooking.model.Userlogin;



@Service
public class RegisterService implements RegisterInterface {
	@Autowired
	RegistrationDAO dao;
	
	 public User insert(User user)
	 {
		 return dao.insert(user);
		 
	 }
	 public Userlogin insertlogin(Userlogin userlogin,boolean match)
	 {
		 return dao.insertlogin(userlogin,match);
		 
	 }
	 public Movie insertmovie(Movie movie){
		 return dao.insertmovie(movie);
	 }
	

}


