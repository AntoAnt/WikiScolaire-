package com.ecetech.b3.itproject.redline.test;

import static org.junit.Assert.*;


import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ecetech.b3.itproject.redline.beans.admin;
import com.ecetech.b3.itproject.redline.beans.cours;
import com.ecetech.b3.itproject.redline.dao.adminDAO;
import com.ecetech.b3.itproject.redline.dao.coursDAO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestAdminDAO {

	@Test
	public void testAGetadmin() {
		admin admin1 = null;
		admin test = new admin(
				"0018fbaa-b596-4239-a228-acbca1bf053a",
				"8b3120be-22fe-4040-afb6-7afc05353e53",
				1
				);
		try {
			admin1 = adminDAO.getadmin("0018fbaa-b596-4239-a228-acbca1bf053a");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification get admin : ",test,admin1);
	}

	@Test
	public void testBGetAlladmin() {
		ArrayList<admin> tab = null;
		try {
			tab = adminDAO.getAlladmin();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification get all admin : ",12,tab.size());
	}

	@Test
	public void testCInsertAdmin() {
		admin admin1 = null;
		admin test = new admin(
				"06f99569-7b65-4d55-978a-b3a8e6e33973",
				"865ade5d5-ae8f-490e-8b21-44d753b9a6e5",
				1
				);
		try {
			adminDAO.insertAdmin(test);
			admin1 = adminDAO.getadmin("06f99569-7b65-4d55-978a-b3a8e6e33973");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification insert admin : ",test,admin1);
	}

	@Test
	public void testEDeleteAdmin() {
		admin admin1 = null;
		admin test = new admin();
		try {
			adminDAO.deleteAdmin("06f99569-7b65-4d55-978a-b3a8e6e33973");
			admin1 = adminDAO.getadmin("06f99569-7b65-4d55-978a-b3a8e6e33973");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification delete admin : ",test,admin1);
	}

	@Test
	public void testDUpdateAdminNivAdmin() {
		admin admin1 = null;
		admin test = new admin();
		try {
			adminDAO.updateAdminNivAdmin("06f99569-7b65-4d55-978a-b3a8e6e33973",3);
			admin1 = adminDAO.getadmin("06f99569-7b65-4d55-978a-b3a8e6e33973");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("SQL Faillure");
		}
		assertEquals("Vérification update amdmin niv admin : ",3,admin1.getNiv_admin());
	}

}
