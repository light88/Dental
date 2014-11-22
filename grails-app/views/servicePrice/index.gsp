<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 11/16/2014
  Time: 9:42 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Login</title>
    <asset:stylesheet src="application.css"/>
</head>

<body>

<g:if test="${flash.message}">
    <div style="border: 2px solid red">
        ${flash?.message}
    </div>
</g:if>

<g:if test="${flash.succeed}">
    <div style="border: 2px solid green">
        ${flash?.succed}
    </div>
</g:if>

<g:form class="form-signin" role="form" action="add" method="post">

    <h2 class="form-signin-heading">Please sign in</h2>


    <input class="form-control" placeholder="price" required autofocus type='text'
           name='price'/>


    <input class="form-control" placeholder="type service in here" required autofocus type='text'
           name='service'/>

    <g:select class="form-control" from="${currency}" name="currency" optionKey="id" optionValue="value" />

    <g:submitButton class="btn btn-primary btn-lg btn-block" name="submit" value="Submit"/><br>
</g:form>
</body>
</html>