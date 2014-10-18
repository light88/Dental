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

    <div class="col-md-8">
        <p class="lead text-center">${patient.firstname} ${patient.lastname} ${patient.patronimic}</p>

        <p class="small text-center"><g:message code="page.dob"/> ${patient.dateOfBirth}</p>

        <p class="small text-center">${patient.phone}</p>
        %{--${patient.gender}--}%

        <div>
            <g:render template="template_teeth" model="[patient: patient, teethUL: teethUL,
                                                        teethUR: teethUR, teethDL: teethDL, teethDR: teethDR]"/>
        </div>


        <div>
            <textarea class="form-control col-md-12" rows="7"></textarea>
            <input class="btn btn-success" onclick="submit();" type="button" value="Submit"/>
        </div>
    </div>

    <div class="col-md-4">

        <div id="listTreatment" class="btn-group-lg" style="margin-top: 20px;">
            list treatment
        </div>
    </div>

</div>

<script>

    var b = function ($) {
        this.listTreatment = $("#listTreatment")
        return {
            updateListTreatment: function (value) {
                listTreatment.html(value)
            }
        }
    }($);

    function ToothConfig($) {

        this.selectedTooth;
        this.htmlTooth;

        this.gettoothdata = function () {
            var o = {}
            o.id = this.htmlTooth.id
            o.name =  this.selectedTooth.data('name')
            return o
        }

        this.selectTooth = function (obj) {
            this.htmlTooth = obj;
            if(this.selectedTooth)
                this.selectedTooth.removeClass("selected")
            this.selectedTooth = $('#' + obj.id)
            this.selectedTooth.addClass("selected")
        }
    }

    var toothConfig = new ToothConfig($)

    function loadData(that) {
        toothConfig.selectTooth(that)
        b.updateListTreatment('loading...')

        $.ajax({
            url: "${createLink(controller: 'treatment', action: 'treatInfo')}",
            data: toothConfig.gettoothdata(),
            type: 'POST'
        }).done(function (data, textStatus, jqXHR) {
            b.updateListTreatment(data)
        });
    }

    function submit() {
        if (!toothConfig.selectedTooth) {
            alert('Select tooth');
            return
        }

        var tooth = toothConfig.gettoothdata()
        tooth.treatment = $('textarea').val()
        $.ajax({
            url: "${createLink(controller: 'treatment', action: 'treat')}",
            data: tooth,
            type: 'POST'
        }).done(function (data, textStatus, jqXHR) {
            b.updateListTreatment(data)
            $('textarea').val('');
        });
    }
</script>
</body>
</html>