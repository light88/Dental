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
    <title>Programs</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
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
        points = ${profile.rating.points},
    </div>

</div>

</body>
</html>