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
<title>Ajout Cours</title>
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
				<form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=Insert_cours">
			
			Si vous voulez Partager vos cours, vous pouvez le faire ici</br></br>
			Vous ne pouvez deposez des cours que de votre niveau scolaire ou en dessous</br></br>
			Selectionner la matiere </br> </br>
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
				</select></br></br>
				 Selectionner le niveau Scolaire </br></br>
				<select name="CHAMP_Cours_Niveau">
					<option value = "TE">Terminal</option>
					<option value = "PR">Premiere</otpion>
					<option value = "SE">Seconde</option>
				</select></br></br>

			Donnez un nom a votre cours</br></br>
			<input type="text" name="CHAMP_Cours_Nom"></br></br>
			Un bref descrption du cours</br></br>
			<input type="text" name="CHAMP_Cours_Doc"></br></br>
			Depose votre fichier</br></br>
			<input type="file" name="file_cours"></br></br>
			<input type="submit" name="Ajout_cours" value="Ajout"></br></br>
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