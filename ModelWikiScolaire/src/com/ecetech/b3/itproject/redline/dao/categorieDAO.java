package com.ecetech.b3.itproject.redline.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import com.ecetech.b3.itproject.redline.beans.categorie;
import com.ecetech.b3.itproject.redline.beans.commentaire;
import com.ecetech.b3.itproject.redline.common.DBAction;

public class categorieDAO {
	public static categorie getcategorie(String id) throws SQLException{
		DBAction.DBConnexion();
		categorie Resultat = new categorie();
		String req =("SELECT * FROM categorie Where id_categorie ='" + id + "'");
		
		  try {
	            DBAction.setRes(DBAction.getStm().executeQuery(req));
	        } catch (SQLException ex) {
	        	System.out.println(ex.getErrorCode());
	        }

	        while (DBAction.getRes().next()) {
	        	Resultat.setId_categorie((DBAction.getRes().getString(1)));
	        	Resultat.setNiveau((DBAction.getRes().getString(2)));
	        	Resultat.setMatiere(DBAction.getRes().getString(3));

	        }

	        DBAction.DBClose();

	        return Resultat;
	    }   
		
		public static ArrayList<categorie> getAllCategorie() throws SQLException {
			DBAction.DBConnexion();
			ArrayList<categorie> resultat = new ArrayList<categorie>();
			String req =("SELECT * FROM categorie ");
			
			  try {
		            DBAction.setRes(DBAction.getStm().executeQuery(req));
		        } catch (SQLException ex) {
		        	System.out.println(ex.getErrorCode());
		        }

		        while (DBAction.getRes().next()) {
		        	resultat.add(new categorie(
		        			DBAction.getRes().getString(1),
		        			DBAction.getRes().getString(2),
		        			DBAction.getRes().getString(3)
		        			));
		        }

		        DBAction.DBClose();
		        
		        return resultat;
			
	    }
		public static int insertCategorie(categorie cat1) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req =  DBAction.getCon().prepareStatement("INSERT INTO categorie (id_categorie, niveau, matiere ) Values (?,?,?);");
			
			
			
			
			if(cat1.getId_categorie()!="")
			{
				req.setString(1,cat1.getId_categorie());
			}
			else
			{
				req.setString(1, UUID.randomUUID().toString());
			}
			
			req.setString(2,cat1.getNiveau());
			req.setString(3,cat1.getMatiere());
			
			
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
		
		public static int deleteCategorie(String id_categorie) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req = DBAction.getCon().prepareStatement("DELETE FROM categorie WHERE id_categorie = ? ;");


			req.setString(1,id_categorie);


			try {
				req.executeUpdate();


			} catch (SQLException ex) {
				System.out.println(ex.getErrorCode());
				return 0;
			}
			DBAction.DBClose();
			return 1;
		}
  
		
		
		public static int updateCategorieNiveau(String id_categorie, String niveau) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE categorie SET niveau = ? WHERE id_categorie = ?");

			req.setString(1, niveau);
			req.setString(2, id_categorie);

			try {
				req.executeUpdate();

			} catch (SQLException ex) {
				System.out.println(ex.getErrorCode());
				return 0;
			}
			DBAction.DBClose();
			return 1;
		}
		
		public static int updateCategorieMatiere(String id_categorie, String matiere) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE categorie SET matiere = ? WHERE id_categorie = ?");

			req.setString(1, matiere);
			req.setString(2, id_categorie);

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
