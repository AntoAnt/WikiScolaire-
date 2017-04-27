<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Recherche_cours</title>
</head>
<body>
<center>
	<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Redirect_Recherche_Cours">
		<table>
			<tr><td> Selectionnez votre matiere</td></tr>
			<tr><td> 
				<select name="Recherche_Matiere">
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
			<tr><td>
				<select name="Recherche_Niveau">
					<option value = "TE">Terminal</option>
					<option value = "PR">Premiere</option>
					<option value = "SE">Seconde</option>
				</select>
			</td></tr>
			<tr><td><input type="submit" name="recherche_cours" value="Recherche"></td></tr>
	</table>
</form>
<table>
<tr> <td>Titre</td><td>Commentaire</td></tr>
		<c:forEach items="${requestScope.tab}" var="i">
			<tr>
				<td><c:out value="${i.titre_cours}"/></td>
				<td><c:out value="${i.doc_cours }"/></td>
				<td><a href="<c:url value="InterfaceWikiScolair/ControleurPrincipal">
				<c:param name="idaction" value="page_cours"/>
				<c:param name="idcours" value="${i.id_cours}"/>
				</c:url>
				">Voir le cours</a> </td>
				
			</tr>
  		</c:forEach>
</table>


</center>
</body>
</html>