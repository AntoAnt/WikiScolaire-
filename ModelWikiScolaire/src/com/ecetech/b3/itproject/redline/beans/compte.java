package com.ecetech.b3.itproject.redline.beans;

public class compte {
	private String id_compte;
	private String id_user;
	private String nom_compte;
	private String prenom_compte;
	private String email_compte;
	private String code_postal;
	private String telephone;
	
/*Builder*/
	public compte() {
		this("","","","","","","");
	}
	

	
	public compte(String id_compte, String id_user, String nom_compte, String prenom_compte, String email_compte,
			String code_postal, String telephone) {
		super();
		this.id_compte = id_compte;
		this.id_user = id_user;
		this.nom_compte = nom_compte;
		this.prenom_compte = prenom_compte;
		this.email_compte = email_compte;
		this.code_postal = code_postal;
		this.telephone = telephone;
	}

/*Getter/Setter*/
	
	public String getId_compte() {
		return id_compte;
	}
	public void setId_compte(String id_compte) {
		this.id_compte = id_compte;
	}
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getNom_compte() {
		return nom_compte;
	}
	public void setNom_compte(String nom_compte) {
		this.nom_compte = nom_compte;
	}
	public String getPrenom_compte() {
		return prenom_compte;
	}
	public void setPrenom_compte(String prenom_compte) {
		this.prenom_compte = prenom_compte;
	}
	public String getEmail_compte() {
		return email_compte;
	}
	public void setEmail_compte(String email_compte) {
		this.email_compte = email_compte;
	}
	public String getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!compte.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final compte other = (compte) obj;
	    if ((this.prenom_compte == null) ? (other.prenom_compte != null) : !this.prenom_compte.equals(other.prenom_compte)) {
	        return false;
	    }
	    if ((this.id_user == null) ? (other.id_user != null) : !this.id_user.equals(other.id_user)){
	        return false;
	    }
	    if ((this.nom_compte == null) ? (other.nom_compte!= null) : !this.nom_compte.equals(other.nom_compte)) {
	        return false;
	    }
	    return true;
	}
	
	
	
}