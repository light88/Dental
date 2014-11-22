<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 11/22/2014
  Time: 5:23 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
${services.first().dentist.profile.firstname}
    <g:each in="${services}" var="service">
        <div>
            ${service.price},${service.currency.value},
            ${service.service},
        </div>
    </g:each>

</body>
</html>