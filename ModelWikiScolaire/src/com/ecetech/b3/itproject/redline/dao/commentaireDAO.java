package com.ecetech.b3.itproject.redline.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.UUID;
import java.sql.Date;

import com.ecetech.b3.itproject.redline.beans.commentaire;
import com.ecetech.b3.itproject.redline.beans.user;
import com.ecetech.b3.itproject.redline.common.DBAction;

public class commentaireDAO {
	
	public static commentaire getcommentaire(String id) throws SQLException {
		DBAction.DBConnexion();
		commentaire c = new commentaire();
		
		String req = ("SELECT * FROM commentaire WHERE id_com='" + id +"'");
		
		
		try{
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		}catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
		}
		while (DBAction.getRes().next()) {
			c.setId_com((DBAction.getRes().getString(1)));
			c.setCommentaire(DBAction.getRes().getString(2));
			c.setNote_com(DBAction.getRes().getFloat(3));
			c.setDate_com(DBAction.getRes().getDate(4));
			c.setId_cours(DBAction.getRes().getString(5));
		}

		DBAction.DBClose();
		return c;
	}
	
	public static ArrayList<commentaire> getAllcommentaire() throws SQLException{
		DBAction.DBConnexion();
		ArrayList<commentaire> resultat = new ArrayList<commentaire>();
		String req =("SELECT * FROM commentaire ");
		
		  try {
	            DBAction.setRes(DBAction.getStm().executeQuery(req));
	        } catch (SQLException ex) {
	        	System.out.println(ex.getErrorCode());
	        }

	        while (DBAction.getRes().next()) {
	        	resultat.add(new commentaire(
	        			DBAction.getRes().getString(1),
	        			DBAction.getRes().getString(2),
	        			DBAction.getRes().getFloat(3),
	        			DBAction.getRes().getDate(4),
	        			DBAction.getRes().getString(5)
	        			));
	        }

	        DBAction.DBClose();
	        
	        return resultat;
		
    }
	
	public static int insertCommentaire(commentaire com1) throws SQLException{
		DBAction.DBConnexion();
		PreparedStatement req =  DBAction.getCon().prepareStatement("INSERT INTO commentaire (id_com, commentaire, note_com, date_com, id_cours ) Values (?,?,?,?,?);");
		
		/*String expect = "dd/MM/yyyy";
		SimpleDateFormat formatter = new SimpleDateFormat(expect);
		java.sql.Date date= new java.sql.Date(System.currentTimeMillis());
				
		try {
			date = new java.sql.Date(formatter.parse(date_com).getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		if(com1.getId_com()!="")
		{
			req.setString(1,com1.getId_com());
		}
		else
		{
			req.setString(1, UUID.randomUUID().toString());
		}
		
		req.setString(2,com1.getCommentaire());
		req.setFloat(3,com1.getNote_com());
		req.setDate( 4, com1.getDate_com());
		req.setString(5,com1.getId_cours());
		
		
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
	
	public static int deleteCommentaire(String id_com) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("DELETE FROM commentaire WHERE id_com = ? ;");


		req.setString(1,id_com);


		try {
			req.executeUpdate();


		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
			return 0;
		}
		DBAction.DBClose();
		return 1;
	}
	
	
	
	public static int updateComCommentaire(String id_com,String commentaire) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE commentaire SET commentaire = ? WHERE id_com = ?");

		req.setString(1, commentaire);
		req.setString(2, id_com);

		try {
			req.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
			return 0;
		}
		DBAction.DBClose();
		return 1;
	}
	public static int updateComNote(String id_com,float note ) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE commentaire SET note_com = ? WHERE id_com = ?");

		req.setFloat(1, note);
		req.setString(2, id_com);

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
