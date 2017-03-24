package com.ecetech.b3.itproject.redline.beans;


public class admin {
	
	private String id_admin;
	private String id_user;
	private int niv_admin;
	
	
	
	

	public admin(String id_admin, String id_user, int niv_admin) {
		super();
		this.id_admin = id_admin;
		this.id_user = id_user;
		this.niv_admin = niv_admin;
	}
	
	public admin(){
		this("","",0);
	}



	/**
	 * Getter et Setter
	 */
	
	
	
	
	
	public String getId_admin() {
		return id_admin;
	}


	public void setId_admin(String id_admin) {
		this.id_admin = id_admin;
	}


	public String getId_user() {
		return id_user;
	}


	public void setId_user(String id_user) {
		this.id_user = id_user;
	}


	public int getNiv_admin() {
		return niv_admin;
	}


	public void setNiv_admin(int niv_admin) {
		this.niv_admin = niv_admin;
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
	    if (obj == null) {
	        return false;
	    }
	    if (!admin.class.isAssignableFrom(obj.getClass())) {
	        return false;
	    }
	    final admin other = (admin) obj;
	    if ((this.id_user == null) ? (other.id_user != null) : !this.id_user.equals(other.id_user)) {
	        return false;
	    }
	    if (this.niv_admin != other.niv_admin) {
	        return false;
	    }
	    return true;
	}
	



}
