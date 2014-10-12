<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 10/12/2014
  Time: 12:42 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <head>
        <meta name="layout" content="main"/>
        <title>Patient</title>
<asset:stylesheet src="tooth.css"/>
</head>
</head>

<body>
<div class="row">

    <div class="col-md-6 col-md-offset-3">
        <p class="lead text-center">${patient.firstname} ${patient.lastname} ${patient.patronimic}</p>

        <p class="small text-center"><g:message code="page.dob"/> ${patient.dateOfBirth}</p>

        <p class="small text-center">${patient.phone}</p>
        %{--${patient.gender}--}%

        <div>
            <g:each in="${patient.mouth.teeth}" var="tooth">
                <img onclick="loadData(this);" class="tooth ${tooth.color}" id="${tooth.id}" data-name="${tooth.name}"/>
            </g:each>
        </div>
        <br/>

        <g:form id="treat" role="form" action="treat">
            <textarea class="form-control col-md-12" rows="7"></textarea>
            <input class="btn btn-success" onclick="s();" type="button" value="Submit"/>
        </g:form>
        <br/>

        <div id="listTreatment" class="bg-info">
            list treatment
        </div>
    </div>

</div>

<script>

    var tooth = {}
    function loadData(that) {
        var x = $('#' + that.id).data('name')
        tooth.id = that.id
        tooth.name = x

        $.ajax({
            url: "${createLink(controller: 'treatment', action: 'treatInfo')}",
            data: tooth,
            type: 'POST'
        }).done(function (data, textStatus, jqXHR) {
//            alert(data)
            $("#listTreatment").html(data)
        });
    }

    function s() {
        tooth.treatment = $('textarea').val()
        $.ajax({
            url: "${createLink(controller: 'treatment', action: 'treat')}",
            data: tooth,
            type: 'POST'
        }).done(function (data, textStatus, jqXHR) {
            alert(data);
        });
    }
</script>
</body>
</html>