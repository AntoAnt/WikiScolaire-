<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil Administrateur</title>
</head>
<body>
<table>
	<tr>Bienvenue sur WikiScolaire! Version Administrateur</tr>
	<tr><td>Ici vous pouvez trouvez tout les cours que vous voulez!</td></tr>
	<tr><td><%out.println(session.getAttribute("login"));%></td></tr>
	<tr><td>Vous pouvez trouvez des cours de <%out.println(session.getAttribute("niv"));%> </td></tr>
	<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Redirect_Recherche_Cours">
		<tr><td><input type="submit" name="Recherche_cours" value="Rechercher"></a></td></tr>
	</form>
	<tr><td>Vous pouvez Ajouter des cours de <%out.println(session.getAttribute("niv"));%> </td></tr>
	<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Redirect_Ajout_Cours">
		<tr><td><input type="submit" name="Ajout_cours" value="Ajout"></td></tr>
	</form>
</table>




</body>
</html>