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
    <title>LIST</title>
</head>

<body>

<div class="row">

    %{--left column--}%
    <div class="col-md-3">
        <ul class="list-group">
            <a href="${createLink(controller: 'patient', action: 'newPatient')}" class="list-group-item
            <g:if test="${controllerName == 'patient' && actionName == 'new'}">active</g:if>">New Patient</a>
            <a href="${createLink(controller: 'patient', action: 'list')}" class="list-group-item
            <g:if test="${controllerName == 'patient' && actionName == 'list'}">active</g:if>">List Patients</a>

        </ul>

        <g:formRemote name="search" url="[controller: 'patient', action: 'search']"
                      update="patientsTable">
            <g:textField class="form-control" type="text" name="name" placeholder="Name"/>
            <g:submitButton class="btn btn-success form-control" name="Search"/>
        </g:formRemote>

    </div>

    <div class="col-md-9">
        <div class="tab-content">

            <div class="panel panel-default">
                <div class="panel-heading panel-title text-center">Patient List</div>
                <table class="table table-striped" id="patientsTable">
                    <g:render template="patient_table" bean="${patients}"/>
                </table>
            </div>
        </div>
    </div>

    <div>

        <g:paginate controller="patient" action="list" total="${size}"/>

        %{--<g:paginate next="Forward" prev="Back"--}%
        %{--maxsteps="0" controller="profile"--}%
        %{--action="list" total="${size}" />--}%

</body>
</html>