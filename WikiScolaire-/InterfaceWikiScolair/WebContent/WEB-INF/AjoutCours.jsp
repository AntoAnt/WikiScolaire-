<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajout Cours</title>
</head>
<body>
<%
String a = (String)session.getAttribute("niv_admin");
int i = 2;
String foo = Integer.toString(i);
System.out.println(a + " " + foo);
if(a == foo){
	
	System.out.println( "Administrateur , vous pouvez ajoutez des cours ");

	
}else{
%>


<center>
<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Insert_cours">
		<table>
			<tr><td>Si vous voulez Partager vos cours, vous pouvez le faire ici</td></tr>
			<tr><td>Vous ne pouvez deposez des cours que de votre niveau scolaire ou en dessous</td></tr>
			<tr><td>  </td></tr>
			<tr><td>Selectionner la matiere </td></tr>
			<tr><td> 
				<select name="CHAMP_Cours_Matiere">
					<option value ="MA">Mathematique</option>
					<option value ="FR">Fran�ais</option>
					<option value ="AN">Anglais</option>
					<option value ="SV">SVT</option>
					<option value ="PH">Physique</option>
					<option value ="EC">economie</option>
					<option value ="HI">Histoire</option>
					<option value ="GE">Geographie</option>
					<option value ="PH">Philosophie</option>
				</select>
			<tr><td> Selectionner le niveau Scolaire</td></tr>
			<tr><td>
				<select name="CHAMP_Cours_Niveau">
					<option value = "TE">Terminal</option>
					<option value = "PR">Premiere</otpion>
					<option value = "SE">Seconde</option>
				</select>
			</td></tr>
			<tr><td>Donnez un nom a votre cours</td></tr>
			<tr><td><input type="text" name="CHAMP_Cours_Nom"></td></tr>
			<tr><td>Un bref descrption du cours</td></tr>
			<tr><td><input type="text" name="CHAMP_Cours_Doc"></td></tr>
			<tr><td>Depose votre fichier</td></tr>
			<tr><td><input type="file" name="file_cours"></td></tr>
			<tr><td><input type="submit" name="Ajout_cours" value="Ajout"></td></tr>
	</table>
</center>
<%
}
%>
</body>
</html>