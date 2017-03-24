package com.ecetech.b3.itproject.redline.beans;

import java.sql.Date;

public class cours {

	private String id_cours;
	private String id_user;
	private String id_categorie;
	private String titre_cours;
	private Date date_cours;
	private String doc_cours;
	
/*Builder*/	
	public cours() {
		this("","","","",null,"");
	}
	

	public cours(String id_cours, String id_user, String id_categorie, String titre_cours, Date date_cours, String doc_cours) {
		super();
		this.id_cours = id_cours;
		this.id_user = id_user;
		this.id_categorie = id_categorie;
		this.titre_cours = titre_cours;
		this.date_cours = date_cours;
		this.doc_cours = doc_cours;
	}
	
/*Getter/Setter*/	
	public String getId_cours() {
		return id_cours;
	}
	public void setId_cours(String id_cours) {
		this.id_cours = id_cours;
	}
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(String id_categorie) {
		this.id_categorie = id_categorie;
	}
	public String getTitre_cours() {
		return titre_cours;
	}
	public void setTitre_cours(String titre_cours) {
		this.titre_cours = titre_cours;
	}
	public Date getDate_cours() {
		return date_cours;
	}
	public void setDate_cours(Date date_cours) {
		this.date_cours = date_cours;
	}
	public String getDoc_cours() {
		return doc_cours;
	}
	public void setDoc_cours(String doc_cours) {
		this.doc_cours = doc_cours;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!cours.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final cours other = (cours) obj;
	    if ((this.titre_cours == null) ? (other.titre_cours != null) : !this.titre_cours.equals(other.titre_cours)) {
	        return false;
	    }
	    if ((this.doc_cours == null) ? (other.doc_cours!= null) : !this.doc_cours.equals(other.doc_cours)) {
	        return false;
	    }
	    return true;
	}
	
	
	
}
