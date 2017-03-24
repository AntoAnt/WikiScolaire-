package com.ecetech.b3.itproject.redline.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

import com.ecetech.b3.itproject.redline.beans.user;
import com.ecetech.b3.itproject.redline.common.DBAction;

public class userDAO {
	public static user getuser(String id) throws SQLException {
		DBAction.DBConnexion();
		user Resultat = new user();
		String req = ("SELECT * FROM user Where id_user ='" + id + "'");

		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			Resultat.setId_user(DBAction.getRes().getString(1));
			Resultat.setLogin((DBAction.getRes().getString(2)));
			Resultat.setMdp(DBAction.getRes().getString(3));
			Resultat.setNiveau(DBAction.getRes().getString(4));

		}

		DBAction.DBClose();

		return Resultat;
	}

	public static ArrayList<user> getAllUser() throws SQLException {
		DBAction.DBConnexion();
		ArrayList<user> resultat = new ArrayList<user>();
		String req = ("SELECT * FROM user ");

		try {
			DBAction.setRes(DBAction.getStm().executeQuery(req));
		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
		}

		while (DBAction.getRes().next()) {
			resultat.add(new user(DBAction.getRes().getString(1), DBAction.getRes().getString(2),
					DBAction.getRes().getString(3), DBAction.getRes().getString(4)));
		}

		DBAction.DBClose();

		return resultat;

	}

	public static int insertUser(user user1) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon()
				.prepareStatement("INSERT INTO user (id_user,login,mdp,niveau) Values (?,?,?,?);");

		if(user1.getId_user() != "")
		{
			req.setString(1, user1.getId_user());
		}
		else
		{
			req.setString(1, UUID.randomUUID().toString());
			
		}
		req.setString(2, user1.getLogin());
		req.setString(3, user1.getMdp());
		req.setString(4, user1.getNiveau());

		try {
			req.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
			return 0;
		}
		DBAction.DBClose();

		return 1;
	}

	public static int updateUserLogin(String id_user, String login) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE user SET login = ? WHERE id_user = ?");

		req.setString(2, id_user);
		req.setString(1, login);

		try {
			req.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
			return 0;
		}
		DBAction.DBClose();
		return 1;
	}
	
	public static int updateUserMdp(String id_user, String mdp) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE user SET mdp = ? WHERE id_user = ?");

		req.setString(2, id_user);
		req.setString(1, mdp);

		try {
			req.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
			return 0;
		}
		DBAction.DBClose();
		return 1;
	}
	
	public static int updateUserNiveau(String id_user, String niveau) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("UPDATE user SET niveau = ? WHERE id_user = ?");

		req.setString(2, id_user);
		req.setString(1, niveau);

		try {
			req.executeUpdate();

		} catch (SQLException ex) {
			System.out.println(ex.getErrorCode());
			return 0;
		}
		DBAction.DBClose();
		return 1;
	}
	
	public static int deleteUser(String id_user) throws SQLException {
		DBAction.DBConnexion();
		PreparedStatement req = DBAction.getCon().prepareStatement("DELETE FROM user WHERE id_user = ? ;");

		req.setString(1,id_user);

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