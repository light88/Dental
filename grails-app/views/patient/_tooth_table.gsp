<g:each in="${treatments}" var="treatment">
    <div>${treatment.tooth.id},
    ${treatment.treatment},
    ${treatment.date},
    </div>
</g:each>