<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire User</title>
</head>
<body>
	<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=authentification">
		<table>
			<td>Identification (index JSP)</td>
			<tr><td>Login</td></tr>
			<tr><td><input type="text" name="CHAMP_login"/><br></td></tr>
			<tr><td>Mot de passe</td></tr>
			<tr><td><input type="password" name="CHAMP_mdp"/><br></td></tr>
			<tr><td><input type="submit" name="bouton" value="connexion" /></tr></td>
			<tr><td>Vous n'avez pas encore de compte ! Inscrivez-vous vite !</td></tr>
			<tr><td><a href = "/InterfaceWikiScolair/Inscription.jsp"><input type ="button" name="Inscription" value = "Inscription" /></a></td></tr>
		</table>
	</form>
</body>
</html>