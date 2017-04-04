<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bienvenue</title>
</head>
<body>
Bienvenue <%out.println(request.getAttribute("login"));%> sur WikiScolaire.
Ici vous pouvez Depose, telecharger ou visionnée des cours de chaque matier ou de chaque niveaux. 


vous pouvez vous deconnecter ici 
<input type= "submit" href = "http://localhost:8080/TPJeeDynamique/Deconnexion.java" name="bouton" value="Deconnexion" />
</body>
</html>