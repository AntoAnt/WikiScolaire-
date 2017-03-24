package com.ecetech.b3.itproject.redline.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ecetech.b3.itproject.redline.beans.categorie;
import com.ecetech.b3.itproject.redline.beans.cours;
import com.ecetech.b3.itproject.redline.dao.categorieDAO;
import com.ecetech.b3.itproject.redline.dao.coursDAO;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestcategorieDAO {

	@Test
	public void testAGetcategorie() {
		categorie cat1 = null;
		categorie test = new categorie(
				"PRAN",
				"Premiere",
				"Anglais"
				);
		try {
			cat1 = categorieDAO.getcategorie("PRAN");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,cat1);
	}

	@Test
	public void testBGetAllCategorie() {
		ArrayList<categorie> tab = null;
		try {
			tab = categorieDAO.getAllCategorie();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetAllUser : ",5,tab.size());
	}

	@Test
	public void testCInsertCategorie() {
		categorie cat1 = null;
		categorie test = new categorie(
				"TEAN",
				"Terminal",
				"Anglais"
				);
		try {
			categorieDAO.insertCategorie(test);
			cat1 = categorieDAO.getcategorie("TEAN");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,cat1);
	}

	@Test
	public void testFDeleteCategorie() {
		categorie cat1 = null;
		categorie test = new categorie();
		try {
			categorieDAO.deleteCategorie("TEAN");
			cat1 = categorieDAO.getcategorie("TEAN");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,cat1);
	}

	@Test
	public void testDUpdateCategorieNiveau() {
		categorie cat1 = null;
		try {
			 categorieDAO.updateCategorieNiveau("TEAN","Seconde");
			 cat1 = categorieDAO.getcategorie("TEAN");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","Seconde",cat1.getNiveau());
	}

	@Test
	public void testEUpdateCategorieMatiere() {
		categorie cat1 = null;
		try {
			 categorieDAO.updateCategorieMatiere("TEAN","Allemend");
			 cat1 = categorieDAO.getcategorie("TEAN");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","Allemend",cat1.getMatiere());
	}

}
