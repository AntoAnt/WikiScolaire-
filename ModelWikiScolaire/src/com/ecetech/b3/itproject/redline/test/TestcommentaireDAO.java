package com.ecetech.b3.itproject.redline.test;

import static org.junit.Assert.*;

import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ecetech.b3.itproject.redline.beans.commentaire;
import com.ecetech.b3.itproject.redline.dao.commentaireDAO;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestcommentaireDAO {

	@Test
	public void testAGetcommentaire() {
		commentaire com1 = null;
		@SuppressWarnings("deprecation")
		commentaire test = new commentaire(
				"27c1f9d8-f297-49b0-8f71-5e6c9b5d3e74",
				"Ce cours est juste genial!",
				4.5f,
				new Date(2016,12,8),
				"89034b51-1b03-4fbf-9700-373dfdff1937"
				);
		try {
			com1 = commentaireDAO.getcommentaire("27c1f9d8-f297-49b0-8f71-5e6c9b5d3e74");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,com1);
	}

	@Test
	public void testBGetAllcommentaire() {
		ArrayList<commentaire> tab = null;
		try {
			tab = commentaireDAO.getAllcommentaire();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetAllUser : ",1,tab.size());
	}

	@Test
	public void testCInsertCommentaire() {
		commentaire com1 = null;
		@SuppressWarnings("deprecation")
		commentaire test = new commentaire(
				"a81ff5c8-fcb7-4933-b1a6-4e204ad43561",
				"Tres instructif.",
				4.0f,
				new Date(2017,1,10),
				"27c1f9d8-f297-49b0-8f71-5e6c9b5d3e48"
				);
		try {
			commentaireDAO.insertCommentaire(test);
			com1 = commentaireDAO.getcommentaire("a81ff5c8-fcb7-4933-b1a6-4e204ad43561");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,com1);
	}

	@Test
	public void testFDeleteCommentaire() {
		commentaire com1 = null;
		commentaire test = new commentaire();
		try {
			commentaireDAO.deleteCommentaire("a81ff5c8-fcb7-4933-b1a6-4e204ad43561");
			com1 = commentaireDAO.getcommentaire("a81ff5c8-fcb7-4933-b1a6-4e204ad43561");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",test,com1);
	}

	@Test
	public void testDUpdateComCommentaire() {
		commentaire com1 = null;
		try {
			 commentaireDAO.updateComCommentaire("a81ff5c8-fcb7-4933-b1a6-4e204ad43561","Un cours gaché...");
			 com1 = commentaireDAO.getcommentaire("a81ff5c8-fcb7-4933-b1a6-4e204ad43561");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ","Un cours gaché...",com1.getCommentaire());
	}

	@Test
	public void testEUpdateComNote() {
		commentaire com1 = null;
		try {
			 commentaireDAO.updateComNote("a81ff5c8-fcb7-4933-b1a6-4e204ad43561",1.0f);
			 com1 = commentaireDAO.getcommentaire("a81ff5c8-fcb7-4933-b1a6-4e204ad43561");
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification GetUser : ",1.0f,com1.getNote_com(),0.5f);
	}

}
