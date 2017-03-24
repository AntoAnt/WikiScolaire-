package com.ecetech.b3.itproject.redline.beans;



public class user {
	
	/**
	 * Attribute
	 * 
	 */
	private String id_user;
	private String login;
	private String mdp;
	private String niveau;
	
	public user(){
		this("", "","","");
	}
	
	public user(String id_user, String login, String mdp, String niveau) {
		super();
		this.id_user = id_user;
		this.login = login;
		this.mdp = mdp;
		this.niveau = niveau;
	}

	
	
	
	public String getId_user() {
		return id_user;
	}
	public void setId_user(String id_user) {
		this.id_user = id_user;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!user.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final user other = (user) obj;
	    if ((this.login == null) ? (other.login != null) : !this.login.equals(other.login)) {
	        return false;
	    }
	    if ((this.mdp == null) ? (other.mdp != null) : !this.mdp.equals(other.mdp)) {
	        return false;
	    }
	    if ((this.niveau == null) ? (other.niveau != null) : !this.niveau.equals(other.niveau)) {
	        return false;
	    }
	    return true;
	}


	
	
	
}
