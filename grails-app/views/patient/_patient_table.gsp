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
</g:each>