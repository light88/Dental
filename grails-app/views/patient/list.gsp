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
            <a href="${createLink(controller: 'patient', action: 'list')}" class="list-group-item
            <g:if test="${controllerName == 'patient' && actionName == 'list'}">active</g:if>">List Patients</a>

            <a href="${createLink(controller: 'patient', action: 'newPatient')}" class="list-group-item
            <g:if test="${controllerName == 'patient' && actionName == 'new'}">active</g:if>">New Patient</a>
        </ul>

        <g:formRemote name="search" url="[controller: 'patient', action: 'search']" update="patientsTable">
            <g:textField class="form-control" type="text" name="name" placeholder="Name"/>
            <g:submitButton class="btn btn-danger form-control" name="Search"/>
        </g:formRemote>

    </div>

    <div class="col-md-9">
        <div class="tab-content">

            <div class="panel panel-default">
                ${patients.size}
                <div class="panel-heading">Patient List</div>

                <table class="table" id="patientsTable">
                    <tr class="info">
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Patronimic</th>
                        <th>DateOfBirth</th>
                        <th>Gender</th>
                        <th>Phone</th>
                    </tr>
                    <g:each in="${patients}" var="patient">
                        <tr>
                            <td>${patient.firstname}</td>
                            <td>${patient.lastname}</td>
                            <td>${patient.patronimic}</td>
                            <td>${patient.dateOfBirth}</td>
                            <td>${patient.gender}</td>
                            <td>${patient.phone}</td>
                        </tr>
                    %{--<td>--}%
                    %{--<!-- Split button -->--}%
                    %{--<div class="btn-group">--}%
                    %{--<a class="btn btn-success"--}%
                    %{--href="${createLink(action: 'groups', params: [id: group.id])}">View</a>--}%
                    %{--<button type="button" class="btn btn-default dropdown-toggle"--}%
                    %{--data-toggle="dropdown">--}%
                    %{--<span class="caret"></span>--}%
                    %{--<span class="sr-only">Toggle Dropdown</span>--}%
                    %{--</button>--}%
                    %{--<ul class="dropdown-menu" role="menu">--}%
                    %{--<li><g:link fragment="#" onclick="setGroupId(${group.id}); " data-toggle="modal"--}%
                    %{--data-target="#m_delete_group">Delete</g:link></li>--}%
                    %{--</ul>--}%
                    %{--</div>--}%
                    %{--</td>--}%
                    %{--</tr>--}%
                    </g:each>
                </table>

            </div>
        </div>
    </div>

</div>
<g:paginate controller="patient" action="list" total="${size}" />

%{--<g:paginate next="Forward" prev="Back"--}%
            %{--maxsteps="0" controller="profile"--}%
            %{--action="list" total="${size}" />--}%

</body>
</html>