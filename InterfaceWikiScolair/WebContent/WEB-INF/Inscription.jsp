<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription</title>
</head>
<body>
<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Inscription">
Inscription<br></br>
Login :<br></br>
<input type="text" name="CHAMP_Login" ><br></br>
Mot de passe :<br></br>
<input type="password" name="CHAMP_Mdp" ><br></br>
Niveaux Scolaire :<br></br>
<input type="text" name="CHAMP_Niv" ><br></br>
--------------------------------------------------------------<br></br>
Nom :<br></br>
<input type="text" name="CHAMP_Nom" ><br></br>
Prenom :<br></br>
<input type="text" name="CHAMP_Prenom" ><br></br>
Email :<br></br>
<input type="text" name="CHAMP_Email" ><br></br>
Code-Postal :<br></br>
<input type="text" name="CHAMP_CP" ><br></br>
Telephone :<br></br>
<input type="text" name="CHAMP_Tel" ><br></br>
<input type="submit" name="bouton" value="connexion" />


</body>
</html>