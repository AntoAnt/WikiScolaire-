<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recherche_cours</title>
</head>
<body>
<center>
	<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Recherche_cours">
		<table>
			<tr>Selectionner votre matiere </tr>
			<tr><td> 
				<select id="Recherche_Matiere">
					<option value ="Mathematique">Mathematique</option>
					<option value ="Fran�ais">Fran�ais</option>
					<option value ="Anglais">Anglais</option>
					<option value ="SVT">SVT</option>
					<option value ="Physique">Physique</option>
					<option value ="economie">economie</option>
					<option value ="Histoire">Histoire</option>
					<option value ="Geographie">Geographie</option>
					<option value ="Philosophie">Philosophie</option>
				</select>
			<tr><td>
				<select id="Recherche_Niveau">
					<option value = "Terminal">Terminal</option>
					<option value = "Premiere">Premiere</otpion>
					<option value = "Seconde">Seconde</option>
				</select>
			</td></tr>
			<tr><td><input type="submit" name="recherche_cours" value="Recherche"></td></tr>
			


	</table>


</center>
</body>
</html>