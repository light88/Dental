<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 5/28/2014
  Time: 2:23 PM
--%>

<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"><!--<![endif]-->
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <title>About</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <asset:stylesheet src="bootstrap.css"/>
</head>

<body>

<div>
    <div class="navbar navbar-inverse navbar-static-top" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a href="${createLink(controller: 'home')}" class="navbar-brand">Dentalbook.com</a>
            </div>

        </div>
    </div>
</div>

<div class="col-md-4">
    <div class="dropdown">
        <button class="btn btn-success" id="pick">Pick one ...</button>
        <button class="btn btn-success" data-toggle="dropdown">
            <span class="caret"></span>
        </button>

        <ul class="dropdown-menu" id="reason">
            <li><a href="#">one</a></li>
            <li><a href="#">two</a></li>
            <li><a href="#">three</a></li>
            <li><a href="#">four</a></li>
        </ul>
    </div>
</div>




<div class="dropdown">
    <button class="btn btn-default dropdown-toggle" type="button" id="menu1" data-toggle="dropdown">Tutorials
        <span class="caret"></span></button>
    <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">HTML</a></li>
        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">CSS</a></li>
        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">JavaScript</a></li>
        <li role="presentation" class="divider"></li>
        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">About Us</a></li>
    </ul>
</div>



<div class="dropdown">
    <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown" aria-expanded="true">
        Dropdown
        <span class="caret"></span>
    </button>
    <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Action</a></li>
        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Another action</a></li>
        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Something else here</a></li>
        <li role="presentation"><a role="menuitem" tabindex="-1" href="#">Separated link</a></li>
    </ul>
</div>
<div class="container">About: Dental notes

</div>

</body>
</html>
