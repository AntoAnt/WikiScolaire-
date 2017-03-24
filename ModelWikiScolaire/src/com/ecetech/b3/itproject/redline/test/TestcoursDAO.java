package com.ecetech.b3.itproject.redline.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ecetech.b3.itproject.redline.beans.cours;

import com.ecetech.b3.itproject.redline.dao.coursDAO;



@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestcoursDAO {

	@Test
	public void testAGetcours() {
		cours cours1 = null;
		@SuppressWarnings("deprecation")
		cours test = new cours(
				"89034b51-1b03-4fbf-9700-373dfdff1937",
				"a755e519-3ae4-49f3-8474-c077a88ccf93",
				"PRAN",
				"Cours Basique d'anglais",
				new Date(2016,11,24),
				"Brian is in the Kitchen = Brian est dans la cuisine."
				);
		try {
			cours1 = coursDAO.getcours("89034b51-1b03-4fbf-9700-373dfdff1937");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,cours1);
	}

	@Test
	public void testBGetAllCours() {
		ArrayList<cours> tab = null;
		try {
			tab = coursDAO.getAllCours();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetAllUser : ",3,tab.size());
	}

	@Test
	public void testCInsertCours() {
		cours cours1 = null;
		@SuppressWarnings("deprecation")
		cours test = new cours(
				"db3a3a8c-6d57-4ea8-8b90-9a43b506233c",
				"ecffbce2-9415-4286-83f7-f2f974db51ee",
				"PRAN",
				"Cours basique d'anglais 3",
				new Date(2017,01,10),
				"English expression : a bird in the hand is better than two in the bush."
				);
		try { 
			coursDAO.insertCours(test);
			cours1 = coursDAO.getcours("db3a3a8c-6d57-4ea8-8b90-9a43b506233c");
			} 
		catch (SQLException e1) 
		{
			e1.printStackTrace(); 
		}
		
		assertEquals("Vérification Insert : ",test,cours1);
	}

	@Test
	public void testHDeleteCours() {
		cours cours1 = null;
		cours test = new cours();
		try { 
			coursDAO.deleteCours("db3a3a8c-6d57-4ea8-8b90-9a43b506233c");
			
			cours1 = coursDAO.getcours("db3a3a8c-6d57-4ea8-8b90-9a43b506233c");
			} 
		catch (SQLException e1) 
		{
			e1.printStackTrace(); 
		}
		
		assertEquals("Vérification Insert : ",test,cours1);
	}

	@Test
	public void testDUpdateCoursIdUser() {
		cours cours1 = null;
		try {
			 coursDAO.updateCoursIdUser("db3a3a8c-6d57-4ea8-8b90-9a43b506233c","d46ad353-719c-4ac6-84b5-105e262cebb1");
			 cours1 = coursDAO.getcours("db3a3a8c-6d57-4ea8-8b90-9a43b506233c");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","d46ad353-719c-4ac6-84b5-105e262cebb1",cours1.getId_user());
	}

	@Test
	public void testEUpdateCoursIdCategorie() {
		cours cours1 = null;
		try {
			 coursDAO.updateCoursIdCategorie("db3a3a8c-6d57-4ea8-8b90-9a43b506233c","SEAN");
			 cours1 = coursDAO.getcours("db3a3a8c-6d57-4ea8-8b90-9a43b506233c");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","SEAN",cours1.getId_categorie());
	}

	@Test
	public void testFUpdateCoursTitreCours() {
		cours cours1 = null;
		try {
			 coursDAO.updateCoursTitreCours("db3a3a8c-6d57-4ea8-8b90-9a43b506233c","testing");
			 cours1 = coursDAO.getcours("db3a3a8c-6d57-4ea8-8b90-9a43b506233c");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","testing",cours1.getTitre_cours());
	}

	@Test
	public void testGUpdateCoursDoc() {
		cours cours1 = null;
		try {
			 coursDAO.updateCoursDoc("db3a3a8c-6d57-4ea8-8b90-9a43b506233c","testing");
			 cours1 = coursDAO.getcours("db3a3a8c-6d57-4ea8-8b90-9a43b506233c");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","testing",cours1.getDoc_cours());
	}

}
