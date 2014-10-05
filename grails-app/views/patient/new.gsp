<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 10/5/2014
  Time: 3:25 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>New Patient</title>
</head>

<body>

<div class="row col-md-6 col-md-offset-3 form-group">
    <h3 class="center">Create new Patient</h3>
    <g:form action="create" method="post" role="form">
        <div class="form-group">
            <strong>Patient FirstName</strong>
            <g:textField class="form-control" type="text" name="firstname"/>
        </div>

        <div class="form-group">
            <strong>LastName</strong>
            <g:textField class="form-control" type="text" name="lastname"/>
        </div>

        <div class="form-group">
            <strong>Patronimic</strong>
            <g:textField class="form-control" type="text" name="patronimic"/>
        </div>

        <div class="form-group">
            <strong>Gender</strong>
            <g:textField class="form-control" type="text" name="gender"/>
        </div>

        <div class="form-group">
            <strong>date of birth</strong>
            <input type="date" name="dateOfBirth" class="form-control"/>
        </div>

        <g:submitButton class="btn btn-info col-md-4 pull-right" name="Submit"/>
    </g:form>
</div>

</body>
</html>