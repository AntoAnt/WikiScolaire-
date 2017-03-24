package com.ecetech.b3.itproject.redline.beans;

public class categorie {

	private String id_categorie;
	private String niveau;
	private String matiere;
	
/*Builder*/
	public categorie() {
		this("","","");
	}
	
	
	public categorie(String id_categorie, String niveau, String matiere) {
		super();
		this.id_categorie = id_categorie;
		this.niveau = niveau;
		this.matiere = matiere;
	}
	
	
/*Getter/Setter*/
	
	public String getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(String id_categorie) {
		this.id_categorie = id_categorie;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!categorie.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final categorie other = (categorie) obj;
	    if ((this.matiere == null) ? (other.matiere != null) : !this.matiere.equals(other.matiere)) {
	        return false;
	    }
	    if ((this.matiere == null) ? (other.matiere!= null) : !this.matiere.equals(other.matiere)) {
	        return false;
	    }
	    return true;
	}
	
}
