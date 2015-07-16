package com.bluemaple.ticketbooking.controller;

//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.ticketbooking.dao.Registration;
import com.bluemaple.ticketbooking.model.Movie;
import com.bluemaple.ticketbooking.model.User;
import com.bluemaple.ticketbooking.model.Userlogin;
//import com.bluemaple.ticketbooking.model.User;
import com.bluemaple.ticketbooking.service.RegisterService;
//import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/Reg")
public class HelloWorldController {

	private List<String> movienames = new ArrayList<String>();
	@Autowired
	RegisterService registerService;
	@Autowired
	Registration registration ;
	@RequestMapping(value = "/Register", method = RequestMethod.POST)
	public String registerMethod(@ModelAttribute User user) {

		registerService.insert(user);
		return "Login";
	}

	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ModelAndView loginMethod(@ModelAttribute Userlogin userlogin,
			boolean match, @ModelAttribute Movie movie) {
		registerService.insertlogin(userlogin, match);
		movie=registerService.insertmovie(movie);
		System.out.println("test");
		System.out.println(movie.toString());
		System.out.println("test1");
		//List<String> list;
		System.out.println(registration.moviearray);
		System.out.println("test2");
		movienames.add(movie.getMovie_name());
		// movienames.add(movie);
		//list=registration.moviearray;
		ModelAndView model = new ModelAndView();
		
		model.setViewName("Moviedashboard");
		model.addObject("Movies",registration.moviearray);
		

		return model;

	}

	 @RequestMapping(value="/Moviedashboard", method=RequestMethod.POST)

	 public String bookMethod()
	 {
	

	 return"Book";

}}
