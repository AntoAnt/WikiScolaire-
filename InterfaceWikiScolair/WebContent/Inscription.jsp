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
<title>Inscription</title>
</head>
<body>
<div class="container-fluid">

            <img src="/InterfaceWikiScolair/image/testelogo.png" class="superpose"/>

            <!--Navbar-->
            <nav class="bar">
                <div class="container">       
                    <ul class="nav navbar-nav navbar-right">
                        <li class="">
						</li>
                    </ul>
                </div>
            </nav>
            <div class="container-fluid">
                <div class="col-xs-12 col-sm-12 col-lg-4 col-md-4 doc">
					<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Inscription">
						Inscription</br>
						Login :</br>
							<input type="text" name="CHAMP_Login" ></br>
						Mot de passe :</br>
							<input type="password" name="CHAMP_Mdp" ></br>
						Niveaux Scolaire :</br>
							<select name="CHAMP_Niv">
								<option value = "Terminal">Terminal</option>
								<option value = "Premiere">Premiere</otpion>
								<option value = "Seconde">Seconde</option>
							</select></br>
						Nom :</br>
							<input type="text" name="CHAMP_Nom" ></br>
						Prenom :</br>
							<input type="text" name="CHAMP_Prenom" ></br>
						Email :</br>
							<input type="text" name="CHAMP_Email" ></br>
						Code-Postal :</br>
							<input type="text" name="CHAMP_CP" ></br>
						Telephone :</br>
							<input type="text" name="CHAMP_Tel" ></br>
							<input type="submit" name="bouton" value="connexion" />
					</form>
				</div>
			</div>
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