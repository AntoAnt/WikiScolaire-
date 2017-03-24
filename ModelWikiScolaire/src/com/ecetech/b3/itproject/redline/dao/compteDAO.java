package com.ecetech.b3.itproject.redline.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import com.ecetech.b3.itproject.redline.beans.compte;
import com.ecetech.b3.itproject.redline.common.DBAction;

public class compteDAO {
	public static compte getcompte(String id) throws SQLException{
		DBAction.DBConnexion();
		compte Resultat = new compte();
		String req =("SELECT * FROM compte Where id_compte ='" + id + "'");
		
		  try {
	            DBAction.setRes(DBAction.getStm().executeQuery(req));
	        } catch (SQLException ex) {
	        	System.out.println(ex.getErrorCode());
	        }

	        while (DBAction.getRes().next()) {
	        	Resultat.setId_compte((DBAction.getRes().getString(1)));
	        	Resultat.setId_user((DBAction.getRes().getString(2)));
	        	Resultat.setNom_compte(DBAction.getRes().getString(3));
	        	Resultat.setPrenom_compte(DBAction.getRes().getString(4));
	        	Resultat.setEmail_compte(DBAction.getRes().getString(5));
	        	Resultat.setCode_postal(DBAction.getRes().getString(6));
	        	Resultat.setTelephone(DBAction.getRes().getString(7));
	        }

	        DBAction.DBClose();

	        return Resultat;
	    }   
		
		public static ArrayList<compte> getAllCompte() throws SQLException {
			DBAction.DBConnexion();
			ArrayList<compte> resultat = new ArrayList<compte>();
			String req =("SELECT * FROM compte ");
			
			  try {
		            DBAction.setRes(DBAction.getStm().executeQuery(req));
		        } catch (SQLException ex) {
		        	System.out.println(ex.getErrorCode());
		        }

		        while (DBAction.getRes().next()) {
		        	resultat.add(new compte(
		    	        	DBAction.getRes().getString(1),
		    	        	DBAction.getRes().getString(2),
		    	        	DBAction.getRes().getString(3),
		    	        	DBAction.getRes().getString(4),
		    	        	DBAction.getRes().getString(5),
		    	        	DBAction.getRes().getString(6),
		    	        	DBAction.getRes().getString(7)
		    	        	));
		        }
		        DBAction.DBClose();
		        
		        return resultat;
			
			
	    }   
		
		public static int insertCompte(compte compte1) throws SQLException {
				DBAction.DBConnexion();
				PreparedStatement req =  DBAction.getCon().prepareStatement("INSERT INTO compte (id_compte, id_user,nom_compte, prenom_compte, email_compte, code_postal, telephone) Values (?,?,?,?,?,?,?);");
				
				if(compte1.getId_compte()!="")
				{
					req.setString(1,compte1.getId_compte());
				}
				else
				{
					req.setString(1,UUID.randomUUID().toString());
				}
				req.setString(2,compte1.getId_user());
				req.setString(3,compte1.getNom_compte());
				req.setString(4,compte1.getPrenom_compte());
				req.setString(5,compte1.getEmail_compte());
				req.setString(6,compte1.getCode_postal());
				req.setString(7,compte1.getTelephone());
				
				
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
		public static int deleteCompte(String id) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req = DBAction.getCon().prepareStatement("DELETE FROM compte WHERE id_compte = ? ;");


			req.setString(1,id);


			try {
				req.executeUpdate();


			} catch (SQLException ex) {
				System.out.println(ex.getErrorCode());
				return 0;
			}
			DBAction.DBClose();
			return 1;
		}
  
		
		public static int updateCompteNom(String id_compte,String Nom) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE compte SET nom_compte = ? WHERE id_compte =? ");

			req.setString(1, Nom);
			req.setString(2, id_compte);

			try {
				req.executeUpdate();

			} catch (SQLException ex) {
				System.out.println(ex.getErrorCode());
				return 0;
			}
			DBAction.DBClose();
			return 1;
		}
		
		public static int updateCompteEmail(String id_compte,String email) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE compte SET email_compte = ? WHERE id_compte = ?");

			req.setString(1, email);
			req.setString(2, id_compte);

			try {
				req.executeUpdate();

			} catch (SQLException ex) {
				System.out.println(ex.getErrorCode());
				return 0;
			}
			DBAction.DBClose();
			return 1;
		}
		
		public static int updateCompteCodePostal(String id_compte,String codePostal) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE compte SET code_postal = ? WHERE id_compte = ?");

			req.setString(1, codePostal);
			req.setString(2, id_compte);

			try {
				req.executeUpdate();

			} catch (SQLException ex) {
				System.out.println(ex.getErrorCode());
				return 0;
			}
			DBAction.DBClose();
			return 1;
		}
		
		public static int updateCompteTelephone(String id_compte,String telephone) throws SQLException {
			DBAction.DBConnexion();
			PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE compte SET telephone = ? WHERE id_compte = ?");

			req.setString(1, telephone);
			req.setString(2, id_compte);

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