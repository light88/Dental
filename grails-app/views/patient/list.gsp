<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 10/5/2014
  Time: 12:22 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Patients</title>
</head>

<body>

<div class="row">

    %{--left column--}%
    <div class="col-sm-3  affix" style="width: 23%; top: 70px;">

    <ul class="nav nav-pills nav-stacked">
    <li <g:if test="${controllerName == 'patient' && actionName == 'newPatient'}">class="active"</g:if>">
        <a href="${createLink(controller: 'patient', action: 'newPatient')}" class="list-group-item
            ">New Patient</a>
    </li>
        <li <g:if test="${controllerName == 'patient' && actionName == 'list'}">class="active"</g:if>><a
                href="${createLink(controller: 'patient', action: 'list')}" class="list-group-item
            ">List Patients</a></li>
    </ul>

        <g:formRemote name="search" url="[controller: 'patient', action: 'search']"
                      update="patientsTable">
            <g:textField class="form-control" type="text" name="name" placeholder="Search"/>
            <g:submitButton class="btn btn-success form-control" name="Search"/>
        </g:formRemote>

    </div>

    %{--right column--}%
    <div class="col-md-9 col-md-offset-3">

        <div class="tab-content"  style="margin-top: 19px;">
            <div class="panel panel-default">
                <div class="panel-heading panel-title text-center">Patient List</div>
                <table class="table " id="patientsTable">
                    <g:render template="patient_table" bean="${patients}"/>
                </table>
            </div>
        </div>
        <g:paginate class="pull-right" controller="patient" action="list" total="${size}" max="10" maxsteps="5"/>
    </div>
</body>
</html>