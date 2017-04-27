<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="/InterfaceWikiScolair/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="/InterfaceWikiScolair/font-awesome-4.6.3/css/font-awesome.min.css"  rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Crimson+Text" rel="stylesheet"> 
    <link href="/InterfaceWikiScolair/style.css" rel="stylesheet">
<title>Formulaire User</title>
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
                <form method="post" action="/InterfaceWikiScolair/ControleurPrincipal?idaction=authentification">
                	Entrez votre login : </br>
                    <input type="text" name="CHAMP_login" size="20" maxlength="10" />
    				<br />
    				Entrez votre mote de passe : </br>							        
        			<input type="password" name="CHAMP_mdp" size="20" maxlength="10"  />
					<br />
   					<input type="submit" name = "bouton" value="connexion" class="btn btn-sm btn-default"/>
   				</form>
                </div>
                <div class="col-xs-12 col-sm-12 col-lg-7 col-md-7 doc">
                Vous n'avez pas encore de compte !!</br>
                Inscrivez vous vite ici !! </br>
                <a href = "/InterfaceWikiScolair/Inscription.jsp"><input type ="button" name="Inscription" value = "Inscription" /></a>
                </div>
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