<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulaire User</title>
</head>
<body>
	<form method="post" action="/ControleurPrincipal?idaction=authentification">
		<table>
			<td>Identification</td>
			<tr><td>Login</td></tr>
			<tr><td><input type="text" name="CHAMP_login"/><br></td></tr>
			<td>Mot de passe</td>
			<tr><td><input type="password" name="CHAMP_mdp"/><br></td></tr>
			<tr><td><input type="submit" name="bouton" value="connexion" /></tr></td>
		</table>
	
	</form>
</body>
</html>