<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 7/5/2014
  Time: 2:25 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <g:layoutTitle>Programs</g:layoutTitle>
</head>

<body>

<h1>Profile</h1>

<div class="row">
    <div class="col-md-3">
        profile index
    </div>

    <div class="col-md-9">
        id = ${profile.id},
        firstname = ${profile.firstname},
        lastname = ${profile.lastname},
        patronimic = ${profile.patronimic},
        phone = ${profile.phone},
    </div>

    <span class="glyphicon glyphicon-ok"> Email verified</span>

</div>

</body>
</html>