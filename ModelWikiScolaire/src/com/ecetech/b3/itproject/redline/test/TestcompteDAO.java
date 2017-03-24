package com.ecetech.b3.itproject.redline.test;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ecetech.b3.itproject.redline.beans.compte;
import com.ecetech.b3.itproject.redline.dao.compteDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestcompteDAO {

	@Test
	public void testAGetcompte() {
		compte compte1 = null;
		compte test = new compte(
				"804c1457-5aa1-43e4-9430-2266fd10c418",
				"a755e519-3ae4-49f3-8474-c077a88ccf93",
				"Mikal",
				"Field",
				"Mikalfield@gmail.com",
				"94000",
				"0698067299"
				);
		try {
			compte1 = compteDAO.getcompte("804c1457-5aa1-43e4-9430-2266fd10c418");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,compte1);
	}

	@Test
	public void testBGetAllCompte() {
		ArrayList<compte> tab = null;
		try {
			tab = compteDAO.getAllCompte();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetAllUser : ",2,tab.size());
	}

	@Test
	public void testCInsertCompte() {
		compte compte1 = null;
		
		compte test = new compte(
				"6e873d78-f195-4536-9e9b-fca9c713bd73",
				"b3e3f6dd-a1be-4b34-9afe-35c5aa44bf5d",
				"Prenom",
				"Nom",	
				"skafei11@gmail.com",
				"94000",
				"067138421"
				);
		try { 
			compteDAO.insertCompte(test);
			compte1 = compteDAO.getcompte("6e873d78-f195-4536-9e9b-fca9c713bd73");
			} 
		catch (SQLException e1) 
		{
			e1.printStackTrace(); 
		}
		
		assertEquals("Vérification Insert : ",test.getId_compte(),compte1.getId_compte());
	}
	
	

	@Test
	public void testHDeleteCompte() {
		compte compte1 = null;
		compte test = new compte();
		try { 
			compteDAO.deleteCompte("6e873d78-f195-4536-9e9b-fca9c713bd73");
			
			compte1 = compteDAO.getcompte("6e873d78-f195-4536-9e9b-fca9c713bd73");
			} 
		catch (SQLException e1) 
		{
			e1.printStackTrace(); 
		}
		
		assertEquals("Vérification Insert : ",test,compte1);
	}

	@Test
	public void testDUpdateCompteNom() {
		compte compte2 = null;
		try {
			 compteDAO.updateCompteNom("6e873d78-f195-4536-9e9b-fca9c713bd73","John");
			 compte2 = compteDAO.getcompte("6e873d78-f195-4536-9e9b-fca9c713bd73");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","John",compte2.getPrenom_compte());
	}

	@Test
	public void testEUpdateCompteEmail() {
		compte compte1 = null;
		try {
			 compteDAO.updateCompteEmail("6e873d78-f195-4536-9e9b-fca9c713bd73","barbados@yahoo.com");
			 compte1 = compteDAO.getcompte("6e873d78-f195-4536-9e9b-fca9c713bd73");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","barbados@yahoo.com",compte1.getEmail_compte());
	}

	@Test
	public void testFUpdateCompteCodePostal() {
		compte compte1 = null;
		try {
			 compteDAO.updateCompteCodePostal("6e873d78-f195-4536-9e9b-fca9c713bd73","75020");
			 compte1 = compteDAO.getcompte("6e873d78-f195-4536-9e9b-fca9c713bd73");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","75020",compte1.getCode_postal());
	}

	@Test
	public void testGUpdateCompteTelephone() {
		compte compte1 = null;
		try {
			 compteDAO.updateCompteTelephone("6e873d78-f195-4536-9e9b-fca9c713bd73","0777854669");
			 compte1 = compteDAO.getcompte("6e873d78-f195-4536-9e9b-fca9c713bd73");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","0777854669",compte1.getTelephone());
	}

}
