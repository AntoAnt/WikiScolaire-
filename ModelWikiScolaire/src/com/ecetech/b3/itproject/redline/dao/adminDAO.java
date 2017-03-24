package com.ecetech.b3.itproject.redline.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ecetech.b3.itproject.redline.beans.admin;
import com.ecetech.b3.itproject.redline.beans.user;
import com.ecetech.b3.itproject.redline.common.DBAction;

public class adminDAO {
	
	public static admin getadmin(String id) throws SQLException {
		DBAction.DBConnexion();
		admin a = new admin();
		
		String req = ("SELECT * FROM admin WHERE id_admin='" + id +"'");
		
		
		try{
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		}catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
		}
		while (DBAction.getRes().next()) {
			a.setId_admin((DBAction.getRes().getString(1)));
			a.setId_user(DBAction.getRes().getString(2));
			a.setNiv_admin(DBAction.getRes().getInt(3));
		}

		DBAction.DBClose();
		return a;
	}
	
	public static ArrayList<admin> getAlladmin() throws SQLException{
		DBAction.DBConnexion();
		ArrayList<admin> resultat = new ArrayList<admin>();
		String req =("SELECT * FROM admin ");
		
		  try {
	            DBAction.setRes(DBAction.getStm().executeQuery(req));
	        } catch (SQLException ex) {
	        	System.out.println(ex.getErrorCode());
	        }

	        while (DBAction.getRes().next()) {
	        	resultat.add(new admin(
	        			DBAction.getRes().getString(1),
	        			DBAction.getRes().getString(2),
	        			DBAction.getRes().getInt(3)
	        			
	        			));
	        }

	        DBAction.DBClose();
	        
	        return resultat;
		
    }
	
	public static int insertAdmin(admin admin1) throws SQLException{
		DBAction.DBConnexion();
		PreparedStatement req =  DBAction.getCon().prepareStatement("INSERT INTO admin (id_admin,id_user,niv_admin) Values (?,?,?);");
		
		req.setString(1,admin1.getId_admin());
		req.setString(2,admin1.getId_user());
		req.setInt(3,admin1.getNiv_admin());
		
		
		try
		 {
            req.executeUpdate();
			 
        } catch (SQLException ex) {
        	System.out.println(ex.getErrorCode());
        	return 0;
        }		
		DBAction.DBClose();
		
		
		return 1;
    }  
	
	
	public static int deleteAdmin(String id_admin) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("DELETE FROM admin WHERE id_admin = ? ;");


		req.setString(1,id_admin);


		try {
			req.executeUpdate();


		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
			return 0;
		}
		DBAction.DBClose();
		return 1;
	}
	
	
	public static int updateAdminNivAdmin(String id_admin, int niv_admin) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE admin SET niv_admin = ? WHERE id_admin = ?");

		req.setInt(1, niv_admin);
		req.setString(2, id_admin);

		try {
			req.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
			return 0;
		}
		DBAction.DBClose();
		return 1;
	}

}
