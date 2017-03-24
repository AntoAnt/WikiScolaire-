package com.ecetech.b3.itproject.redline.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.UUID;

import com.ecetech.b3.itproject.redline.beans.cours;
import com.ecetech.b3.itproject.redline.common.DBAction;

@SuppressWarnings("unused")
public class coursDAO {
	
	
		public static cours getcours(String id) throws SQLException{
			DBAction.DBConnexion();
			cours Resultat = new cours();
			String req =("SELECT * FROM cours Where id_cours ='" + id + "'");
			
			  try {
		            DBAction.setRes(DBAction.getStm().executeQuery(req));
		        } catch (SQLException ex) {
		        	System.out.println(ex.getErrorCode());
		        }

		        while (DBAction.getRes().next()) {
		        	Resultat.setId_cours((DBAction.getRes().getString(1)));
		        	Resultat.setId_user((DBAction.getRes().getString(2)));
		        	Resultat.setId_categorie(DBAction.getRes().getString(3));
		        	Resultat.setTitre_cours(DBAction.getRes().getString(4));
		        	Resultat.setDate_cours(DBAction.getRes().getDate(5));
		        	Resultat.setDoc_cours(DBAction.getRes().getString(6));
		        }

		        DBAction.DBClose();

		        return Resultat;
		    }   
			
			public static ArrayList<cours> getAllCours() throws SQLException {
				DBAction.DBConnexion();
				ArrayList<cours> resultat = new ArrayList<cours>();
				String req =("SELECT * FROM cours ");
				
				  try {
			            DBAction.setRes(DBAction.getStm().executeQuery(req));
			        } catch (SQLException ex) {
			        	System.out.println(ex.getErrorCode());
			        }

			        while (DBAction.getRes().next()) {
			        	resultat.add(new cours(
			        			DBAction.getRes().getString(1),
			    	        	DBAction.getRes().getString(2),
			    	        	DBAction.getRes().getString(3),
			    	        	DBAction.getRes().getString(4),
			    	        	DBAction.getRes().getDate(5),
			    	        	DBAction.getRes().getString(6)
			    	        	));
			        }

			        DBAction.DBClose();
			        
			        return resultat;
				
				
		    }    
			
			public static int insertCours(cours cours1) throws SQLException {
				DBAction.DBConnexion();
				PreparedStatement req =  DBAction.getCon().prepareStatement("INSERT INTO cours (id_cours, id_user, id_categorie, titre_cours, date_cours, doc_cours ) Values (?,?,?,?,?,?);");
				
				/*String expect = "dd/MM/yyyy";
				SimpleDateFormat formatter = new SimpleDateFormat(expect);
				java.sql.Date date= new java.sql.Date(System.currentTimeMillis());
						
				try {
					date = new java.sql.Date(formatter.parse(date_cours).getTime());
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}*/
				
				if(cours1.getId_cours()!="")
				{
					req.setString(1,cours1.getId_cours());
				}
				else
				{
					req.setString(1, UUID.randomUUID().toString());
				}
				
				req.setString(2,cours1.getId_user());
				req.setString(3,cours1.getId_categorie());
				req.setString(4,cours1.getTitre_cours());
				req.setDate( 5, cours1.getDate_cours());                   ///req.setDate( 5, date);
				req.setString(6,cours1.getDoc_cours());
				
				
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
			
			public static int deleteCours(String id) throws SQLException {
				DBAction.DBConnexion();
				PreparedStatement req = DBAction.getCon().prepareStatement("DELETE FROM cours WHERE id_cours = ? ;");


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

			
			
			public static int updateCoursIdUser(String id_cours, String id_user) throws SQLException {
				DBAction.DBConnexion();
				PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE cours SET id_user = ? WHERE id_cours = ?");

				req.setString(1, id_user);
				req.setString(2,id_cours);

				try {
					req.executeUpdate();

				} catch (SQLException ex) {
					System.out.println(ex.getErrorCode());
					return 0;
				}
				DBAction.DBClose();
				return 1;
			}
			
			
			public static int updateCoursIdCategorie(String id_cours, String id_categorie) throws SQLException {
				DBAction.DBConnexion();
				PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE cours SET id_categorie = ? WHERE id_cours = ?");

				req.setString(1, id_categorie);
				req.setString(2,id_cours);

				try {
					req.executeUpdate();

				} catch (SQLException ex) {
					System.out.println(ex.getErrorCode());
					return 0;
				}
				DBAction.DBClose();
				return 1;
			}
			
			public static int updateCoursTitreCours(String id_cours, String titre_cours) throws SQLException {
				DBAction.DBConnexion();
				PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE cours SET titre_cours = ? WHERE id_cours = ?");

				req.setString(1,titre_cours);
				req.setString(2,id_cours);

				try {
					req.executeUpdate();

				} catch (SQLException ex) {
					System.out.println(ex.getErrorCode());
					return 0;
				}
				DBAction.DBClose();
				return 1;
			}
			
			public static int updateCoursDoc(String id_cours, String doc_cours) throws SQLException {
				DBAction.DBConnexion();
				PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE cours SET doc_cours = ? WHERE id_cours = ?");

				req.setString(1,doc_cours);
				req.setString(2,id_cours);

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
