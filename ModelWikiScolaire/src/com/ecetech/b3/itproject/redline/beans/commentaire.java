package com.ecetech.b3.itproject.redline.beans;

import java.sql.Date;

public class commentaire {

	private String id_com;
	private String commentaire;
	private float note_com;
	private Date date_com;
	private String id_cours;
	
	
	public commentaire(String id_com, String commentaire, float note_com, Date date_com, String id_cours) {
		super();
		this.id_com = id_com;
		this.commentaire = commentaire;
		this.note_com = note_com;
		this.date_com = date_com;
		this.id_cours = id_cours;
	}
	
	public commentaire () {
		this("","",0,null,"");
	}
	
	
	/**
	 * Getter et Setter
	 */
	
	
	public String getId_com() {
		return id_com;
	}
	public void setId_com(String id_com) {
		this.id_com = id_com;
	}
	public String getCommentaire() {
		return commentaire;
	}
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	public float getNote_com() {
		return note_com;
	}
	public void setNote_com(float note_com) {
		this.note_com = note_com;
	}
	public Date getDate_com() {
		return date_com;
	}
	public void setDate_com(Date date_com) {
		this.date_com = date_com;
	}
	public String getId_cours() {
		return id_cours;
	}
	public void setId_cours(String id_cours) {
		this.id_cours = id_cours;
	}
	
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!commentaire.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final commentaire other = (commentaire) obj;
	    if ((this.commentaire == null) ? (other.commentaire != null) : !this.commentaire.equals(other.commentaire)) {
	        return false;
	    }
	    if ((this.id_cours == null) ? (other.id_cours!= null) : !this.id_cours.equals(other.id_cours)) {
	        return false;
	    }
	    return true;
	}
	
	
	
	
}
