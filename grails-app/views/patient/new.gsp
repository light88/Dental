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

<div class="row">

    %{--left column--}%
    <div class="col-md-3">
        <ul class="nav nav-pills nav-stacked">
        <li <g:if test="${controllerName == 'patient' && actionName == 'newPatient'}">class="active"</g:if>">
            <a href="${createLink(controller: 'patient', action: 'newPatient')}" class="list-group-item
            ">New Patient</a>
        </li>
            <li <g:if test="${controllerName == 'patient' && actionName == 'list'}">class="active"</g:if>><a
                    href="${createLink(controller: 'patient', action: 'list')}" class="list-group-item
            ">List Patients</a></li>
        </ul>

    </div>


%{--right column--}%
<div class="col-md-7">
    <div class="tab-content">
        <g:form action="create" method="post" role="form">
            <div class="form-group">
                <g:textField class="form-control input-lg" type="text" name="firstname" placeholder="FirstName"/>
            </div>

            <div class="form-group">
                <g:textField class="form-control input-lg" type="text" name="lastname" placeholder="LastName"/>
            </div>

            <div class="form-group">
                <g:textField class="form-control input-lg" type="text" name="patronimic" placeholder="Patronimic"/>
            </div>

            <div class="form-group">
                <g:radioGroup values="['male, female']" name="gender">
                    <g:radio name="gender" value="1" align="absmiddle"/>Male
                    <g:radio name="gender" value="0"/>Female
                </g:radioGroup>
            </div>

            <div class="form-group">
                <g:textField class="form-control input-lg" type="text" name="phone" placeholder="Phone"/>
            </div>

            <div class="form-group">
                <input type="date" name="dateOfBirth" class="form-control input-lg" placeholder="DOB"/>
            </div>

            <g:submitButton class="btn btn-primary btn-lg col-md-4 pull-right" name="Submit"/>
        </g:form>
    </div>
</div>

</div>

</body>
</html>