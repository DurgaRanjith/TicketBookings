package com.bluemaple.ticketbooking.service;

//import com.bluemaple.ticketbooking.dao.Registration;
//import com.bluemaple.ticketbooking.model.Book;
import com.bluemaple.ticketbooking.model.Movie;
import com.bluemaple.ticketbooking.model.User;
import com.bluemaple.ticketbooking.model.Userlogin;

public interface RegisterInterface {

	 public User insert(User user);
	 public Userlogin insertlogin(Userlogin userlogin,boolean match);
	 public Movie insertmovie(Movie movie);
}
