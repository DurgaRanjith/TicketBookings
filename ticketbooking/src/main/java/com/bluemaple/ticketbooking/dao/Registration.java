package com.bluemaple.ticketbooking.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



//import com.bluemaple.ticketbooking.model.Book;
import com.bluemaple.ticketbooking.model.Movie;
import com.bluemaple.ticketbooking.model.Movielist;
import com.bluemaple.ticketbooking.model.User;
import com.bluemaple.ticketbooking.model.Userlogin;


@Repository
public class Registration implements RegistrationDAO {
	public List<Movie> moviearray = new ArrayList<Movie>();
	@Autowired
	private DataSource dataSource;
	 
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
 
	public User insert(User user){
 
		String sql = "INSERT INTO USER " +
				"(username,password,temp_pass,first_name,last_name,email_address,address,user_role) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		Connection conn = null;
 
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ps.setString(1, user.getUsername());
			ps.setString(2, user.getPassword());
			ps.setString(3,user.getTemp_pass());
			ps.setString(4,user.getFirst_name());
			ps.setString(5,user.getLast_name());
			ps.setString(6,user.getEmailaddress());
			ps.setString(7,user.getAddress());
			ps.setString(8,user.getUser_role());
			ps.executeUpdate();
			System.out.println(ps);
			ps.close();
 
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return null;
	}
	
	
	
	
public Userlogin insertlogin(Userlogin userlogin,boolean match){
		
		
		String sql = "SELECT * FROM user WHERE username='"+userlogin.getUsername()+"' AND password='"+userlogin.getPassword()+"'";
		Connection conn = null;
		 ResultSet rs=null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			rs=ps.executeQuery(sql);
			 if (rs.next())
			 {
			        if(rs.getString("username").equals(userlogin.getUsername()) && (rs.getString("password").equals(userlogin.getPassword())))
			        {
			        	
			        	System.out.println("yes");
			        	match=true;
			        }
			        else
			        {
			        	System.out.println("fail");
			        	match=false;
			        }
			
			    }
			
			
			System.out.println(ps);
			ps.close();
 
		} catch (SQLException e) {
			System.out.println(e.getLocalizedMessage());
			throw new RuntimeException(e);
 
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
		return userlogin;
		
	}


public Movie insertmovie(Movie movie){
	
	
	String sql = "SELECT movie_name, release_date FROM movie";
	Connection conn = null;
	 ResultSet rs=null;
	try {
		conn = dataSource.getConnection();
		PreparedStatement ps = conn.prepareStatement(sql);
		rs=ps.executeQuery(sql);
		
		
		while (rs.next()) {
			Movie movies = new Movie(rs.getString("movie_name"), rs.getString("release_date"));
	        moviearray.add(movies);
	        //System.out.println(movie_name + "     " + release_date);
	        //movie.setMovie_name(movie_name);
	        //movie.setRelease_date(release_date);
	        System.out.println(moviearray);
	        
	}
		System.out.println(movie);
		
		System.out.println(ps);
		ps.close();

	} catch (SQLException e) {
		System.out.println(e.getLocalizedMessage());
		throw new RuntimeException(e);

	} finally {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {}
		}
	}
	return movie;
	
}

 

}
