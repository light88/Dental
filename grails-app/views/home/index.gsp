<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 5/28/2014
  Time: 1:25 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title></title>
</head>

<body>
<div>
    <h1 class="title">Home page</h1>
    home in hehre//${q}
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


<div class="col-md-4">
    <div class="dropdown">
        <button class="btn btn-default dropdown-toggle" type="button" id="dropdownMenu1" data-toggle="dropdown"
                aria-expanded="true">
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
</div>
</body>
</html>