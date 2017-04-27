<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/InterfaceWikiScolair/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/InterfaceWikiScolair/font-awesome-4.6.3/css/font-awesome.min.css"  rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Crimson+Text" rel="stylesheet"> 
    <link href="/InterfaceWikiScolair/style.css" rel="stylesheet">
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Accueil Administrateur</title>
</head>
<body>
<div class="container-fluid">

            <img src="/InterfaceWikiScolair/image/testelogo.png" class="superpose"/>

            <!--Navbar-->
            <nav class="bar">
                <div class="container">       
                    <ul class="nav navbar-nav navbar">
                        <li class="">
                        	Bienvenue sur WikiScolaire!</br>
						</li>
                    </ul>
                </div>
            </nav>

<div class="container-fluid">
                <div class="col-xs-12 col-sm-12 col-lg-4 col-md-4 doc">
	Ici vous pouvez trouvez tout les cours que vous voulez!</br>
	<%out.println(session.getAttribute("login"));%></br>
	Vous pouvez trouvez des cours de <%out.println(session.getAttribute("niv"));%> </br>
	<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Redirect_Recherche_Cours">
		<tr><td><input type="submit" name="Recherche_cours" value="Rechercher"></a></br>
	</form>
		</div>
</div>
<div class="container-fluid">
                <div class="col-xs-12 col-sm-12 col-lg-4 col-md-4 doc">
	Vous pouvez Ajouter des cours de <%out.println(session.getAttribute("niv"));%> </br>
	<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Redirect_Ajout_Cours">
		<input type="submit" name="Ajout_cours" value="Ajout un cours"></br>
	</form>
	</div>
</div>
</table>




</body>
<!-- Bootstrap core JavaScript
                    ================================================== -->
        <!-- Placed at the end of the document so the pages load faster -->
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
        <script src="../../dist/js/bootstrap.min.js"></script>
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>
</html>