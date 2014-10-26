<g:if test="${treatments.size() > 0}">
    <g:each in="${treatments}" var="treatment">
        <div href="#" class="list-group-item">
            <h4 class="list-group-item-heading">
                <span>
                    <a target="_blank" href="${createLink(controller: 'profile', id: treatment.dentist.profile.id)}">
                        ${treatment.dentist.profile.firstname} ${treatment.dentist.profile.lastname}
                    </a>
                    ${treatment.date.dateString}
                </span>
            </h4>
            <span class="list-group-item-text" style="word-wrap: break-word;">
                ${treatment.treatment}
            </span>
        </div>
    </g:each>
</g:if>
<g:else>
    <div href="#" class="list-group-item">
        <span class="list-group-item-text" style="word-wrap: break-word;">
            No DATA .............
        </span>
    </div>
</g:else>
