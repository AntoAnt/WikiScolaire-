package com.ecetech.b3.itproject;

import java.io.IOException;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;


import javax.mail.Session;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ecetech.b3.itproject.redline.beans.admin;
import com.ecetech.b3.itproject.redline.beans.categorie;
import com.ecetech.b3.itproject.redline.beans.compte;
import com.ecetech.b3.itproject.redline.beans.cours;
import com.ecetech.b3.itproject.redline.beans.user;
import com.ecetech.b3.itproject.redline.dao.adminDAO;
import com.ecetech.b3.itproject.redline.dao.categorieDAO;
import com.ecetech.b3.itproject.redline.dao.compteDAO;
import com.ecetech.b3.itproject.redline.dao.coursDAO;
import com.ecetech.b3.itproject.redline.dao.userDAO;
import com.sun.glass.ui.Pixels.Format;

/**
 * Servlet implementation class ControleurPrincipal
 */

public class ControleurPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControleurPrincipal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idaction = request.getParameter("idaction");
		String id_user_session = "";
		String login_user_session = "";
		String niv_user_session = "";
		HttpSession session = request.getSession();
		
		
		
		if(idaction==null){
			System.out.println("erreur idaction non trouv�");
			this.getServletContext().getRequestDispatcher("/InterfaceWikiScolair/Index.html").forward( request, response );
		}
		else if(idaction.equals("authentification")){
			String login = request.getParameter("CHAMP_login");
			String psw = request.getParameter("CHAMP_mdp");
			user u = null;
			//String psw = cripterPswAlgoInit(request.getParameter("CHAMP_mdp"));
			try {
				//user u = userDAO.getuserLoginPsw(login,psw);
				u = userDAO.getuserbylogin(login);
				if(u == null){
					// forward vers la page jsp d'erreur d'authentification ; user login inexistant
					System.out.println("erreur user null");
				}
				else if(!(u.getMdp().equals(psw))){
					// forward vers la �ge jsp d'erreur d'authentification ; user psw erron�
				}
				else if(u.getMdp().equals(psw)){
					
				admin a = adminDAO.getadminbyiduser(u.getId_user());
				
					if (a.getNiv_admin() == 2){
						
						System.out.println("Ok Creation de la session admin");
						// cr�ation d'une session utilisateur ...
						//HttpSession session = request.getSession();
						session.setAttribute( "login", u.getLogin() );
						session.setAttribute("id", u.getId_user());
						session.setAttribute("niv", u.getNiveau());
						session.setAttribute("niv_admin", a.getNiv_admin());
						
						// forward vers la page d'acceuil apr�s authentification
						this.getServletContext().getRequestDispatcher("/WEB-INF/accueil_admin.jsp").forward( request, response );
						
					}
					else{
					System.out.println("Ok Creation de la session user");
					// cr�ation d'une session utilisateur ...
					//HttpSession session = request.getSession();
					session.setAttribute( "login", u.getLogin() );
					session.setAttribute("id", u.getId_user());
					session.setAttribute("niv", u.getNiveau());
					id_user_session = u.getId_user();
					login_user_session = u.getLogin();
					niv_user_session = u.getNiveau();
					
					// forward vers la page d'acceuil apr�s authentification
					this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward( request, response );
					}
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//tester sur l'exception et selon le code -> retourner une url : 505... 404...
			}
			
		}
		/* When the creation of a new user is requested*/
		else if(idaction.equals("Inscription")){
			//String id = request.getParameter("CHAMP_id"); to generate UUID
			String id_user = "";
			String login = request.getParameter("CHAMP_Login");			
			String psw = request.getParameter("CHAMP_Mdp");
			String niveau =request.getParameter("CHAMP_Niv");
			String id_compte = "";
			String Nom =request.getParameter("CHAMP_Nom");
			String Prenom =request.getParameter("CHAMP_Prenom");
			String Email =request.getParameter("CHAMP_Email");
			String Telephone =request.getParameter("CHAMP_Tel");
			String Codepostal =request.getParameter("CHAMP_CP");
			

			user u = new user(id_user, login, psw, niveau);
			compte c = new compte(id_compte, id_user, Nom, Prenom, Email, Codepostal, Telephone);
			try {
				if(login != null){
					System.out.println("login null");
					// forward vers la page jsp d'erreur d'Inscription ; user login non renseigner
					if(psw != null){
						System.out.println("psw null");
						// forward vers la page jsp d'erreur d'Inscription ; user psw non renseigner
						if(niveau != null){
							System.out.println("niveau null");
							// forward vers la page jsp d'erreur d'Inscription ; user Niveau non renseigner
							if(Nom != null){
								System.out.println("Nom null");
								// forward vers la page jsp d'erreur d'Inscription ; user Nom non renseigner
								 if(Prenom != null){
										System.out.println("Prenom null");
										// forward vers la page jsp d'erreur d'Inscription ; user Prenom non renseigner
										 if(Email != null){
												System.out.println("Email null");
												// forward vers la page jsp d'erreur d'Inscription ; user Email non renseigner
												if(Codepostal != null){
													System.out.println("Codepostal null");
													// forward vers la page jsp d'erreur d'Inscription ; user CP non renseigner
													if (Telephone != null){
														System.out.println("Telephone null");
														// forward vers la page jsp d'erreur d'Inscription ; user Tel non renseigner
												
													int codeop = userDAO.insertUser(u);
													
													String iduserinit = userDAO.getuserbylogin(u.getLogin()).getId_user();
													System.out.println(iduserinit + "cest l'id du user");
													compte compteuser = new compte(id_compte, iduserinit, Nom, Prenom, Email, Codepostal, Telephone);
													int codeinscription = compteDAO.insertCompte(compteuser);
													System.out.println(codeinscription + "est la valeur du bidule d'inscription");
													System.out.print(codeop + "est la valeur du bidule\n");

													System.out.print("gg");
													this.getServletContext().getRequestDispatcher("/Index.html").forward( request, response );
													
													//selon le code ... retourner le r�sultat de l'op�ration ... utilisateur ajout� avec succ�s;
												
												}
											}
										}
									}
								}
							}
						}
					}
				 	
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//tester sur l'exception et selon le code -> retourner une url : 505... 404...
			}
			
		}
		//else if(idaction.equals("Recherche_cours"))
		//{
		//	String recherche_matiere = request.getParameter("Recherche_Matiere");
		//	String recherche_niveau = request.getParameter("Recherche_Niveau");
		//	String id_categorie = "";
		//
		//	try {
		//		//Get cours by matier/niveau/categorie
		//		this.getServletContext().getRequestDispatcher("/WEB-INF/RechercheResultat.jsp").forward( request, response );
		//	} catch (SQLException e) {
		//		// TODO Auto-generated catch block
		//		e.printStackTrace();
				//tester sur l'exception et selon le code -> retourner une url : 505... 404...
		//	}

		//}
		else if(idaction.equals("Redirect_Recherche_Cours"))
		{
			//HttpSession session = request.getSession();
			if( session.getAttribute("login") == null )
			{
				this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward( request, response );
			}
			else{
				this.getServletContext().getRequestDispatcher("/WEB-INF/Recherche.jsp").forward( request, response );
			}
		}
		else if(idaction.equals("Redirect_Ajout_Cours"))
		{
			//HttpSession session = request.getSession();
			if( session.getAttribute("login") == null )
			{
				System.out.println("erreur");
				this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward( request, response );
			}
			else{
				System.out.println("redirect faite");
				this.getServletContext().getRequestDispatcher("/WEB-INF/AjoutCours.jsp").forward( request, response );
			}
		}
				
		else if(idaction.equals("coursesList"))
		{
			//HttpSession session = request.getSession();
			if( session.getAttribute("login") == null )
			{
				this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward( request, response );
			}
			else
			{
				ArrayList<cours> resultat = null;
				try {
					resultat = coursDAO.getAllCours();
					//on affiche le nombre de cours dans l'arraylist
					System.out.println(resultat.size()+" est le nombre de cours");
					// on redirige vers l� page de la liste des cours
					
					this.getServletContext().getRequestDispatcher("/WEB-INF/Recherche.jsp").forward( request, response );
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					//tester sur l'exception et selon le code -> retourner une url : 505... 404...
				}
			}
		}
		
		
		else if(idaction.equals("Insert_cours"))
		{			
			//HttpSession session = request.getSession();
		if( session.getAttribute("login") == null )
		{
			this.getServletContext().getRequestDispatcher("/WEB-INF/Index.jsp").forward( request, response );
		}else{
			
			String Insert_Matiere = request.getParameter("CHAMP_Cours_Matiere");
			String Insert_Niveau = request.getParameter("CHAMP_Cours_Niveau");
			String id_categorie = "";
			String titre_cours = request.getParameter("CHAMP_Cours_Nom");
			String doc_cours = request.getParameter("CHAMP_Cours_Doc");
			String id_cours ="";
			String id_user = (String)(session.getAttribute("id"));
			String ID_CATEGO = Insert_Niveau+Insert_Matiere;
			java.sql.Date date_cours = new java.sql.Date(System.currentTimeMillis());
			
			cours Ajoutcours = new cours(id_cours, id_user , ID_CATEGO , titre_cours, date_cours, doc_cours);
			try{
				System.out.println(id_user);
				int Insert_cours = coursDAO.insertCours(Ajoutcours);
				System.out.println("ok insertcours");
				this.getServletContext().getRequestDispatcher("/WEB-INF/accueil.jsp").forward( request, response );
			}catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//tester sur l'exception et selon le code -> retourner une url : 505... 404...
			}

		}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}