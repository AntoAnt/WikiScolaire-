package com.ecetech.b3.itproject.redline.test;

import static org.junit.Assert.*;



import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ecetech.b3.itproject.redline.beans.user;
import com.ecetech.b3.itproject.redline.dao.userDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestuserDAO {
	

	@Test /// on vérifie qu'on peut obtenir un user
	public void testAGetuser() { 
		user user1 = null;
		user test = new user("7ff54bcb-6c5f-40d7-ae2b-a54701089954","Jean","963852","Terminal");
		try {
			user1 = userDAO.getuser("7ff54bcb-6c5f-40d7-ae2b-a54701089954");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,user1);
	}

	@Test /// on vérifie qu'on peut obtenir tout les users
	public void testBGetAllUser() {
		ArrayList<user> tab = null;
		try {
			tab = userDAO.getAllUser();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetAllUser : ",15,tab.size());
	}

	@Test /// on vérifie qu'on peut inseret 1 user
	public void testCInsertUser() {
		user user1 = null;
		user test = new user("1ec1ecdc-7f21-4da3-8790-626b093b6c51","Kevin","857698","Terminal");
		try { 
			userDAO.insertUser(test);
			user1 = userDAO.getuser("1ec1ecdc-7f21-4da3-8790-626b093b6c51");
			} 
		catch (SQLException e1) 
		{
			e1.printStackTrace(); 
		}
		
		assertEquals("Vérification Insert : ",test,user1);
	}

	@Test /// on vérifie qu'on pour modifier les logins
	public void testDUpdateUserLogin() {
		user user1 = null;
		try {
			 userDAO.updateUserLogin("7ff54bcb-6c5f-40d7-ae2b-a54701089954","Jean-Pierre");
			 user1 = userDAO.getuser("7ff54bcb-6c5f-40d7-ae2b-a54701089954");
			 userDAO.updateUserLogin("7ff54bcb-6c5f-40d7-ae2b-a54701089954","Jean");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","Jean-Pierre",user1.getLogin());
	}

	@Test
	public void testEUpdateUserMdp() {
		user user1 = null;
		try {
			 userDAO.updateUserMdp("7ff54bcb-6c5f-40d7-ae2b-a54701089954","mot de passe");
			 user1 = userDAO.getuser("7ff54bcb-6c5f-40d7-ae2b-a54701089954");
			 userDAO.updateUserMdp("7ff54bcb-6c5f-40d7-ae2b-a54701089954","963852");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","mot de passe",user1.getMdp());
	}

	@Test
	public void testFUpdateUserNiveau() {
		user user1 = null;
		try {
			 userDAO.updateUserNiveau("7ff54bcb-6c5f-40d7-ae2b-a54701089954","Premiere");
			 user1 = userDAO.getuser("7ff54bcb-6c5f-40d7-ae2b-a54701089954");
			 userDAO.updateUserNiveau("7ff54bcb-6c5f-40d7-ae2b-a54701089954","Terminal");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","Premiere",user1.getNiveau());
	}

	@Test
	public void testGDeleteUser() {
		user user1 = null;
		user test = new user();
		try 
		{ 
			userDAO.deleteUser("1ec1ecdc-7f21-4da3-8790-626b093b6c51");
			user1 = userDAO.getuser("1ec1ecdc-7f21-4da3-8790-626b093b6c51");
		} 
		catch (SQLException e1) 
		{
			e1.printStackTrace(); 
		}
		
		assertEquals("Vérification delete : ",test,user1);
		
	}

}
