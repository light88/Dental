<div>
    <div style="display: inline-block" class="center-block">
        <g:each in="${teethUP}" var="tooth">
            <div style="display: inline-block;"
                 onclick="loadData(this);" class="tooth ${tooth.color}" id="${tooth.id}"
                 data-name="${tooth.name}"></div>
        </g:each>
    </div>

    <div style="display: inline-block">
        <g:each in="${teethDOWN}" var="tooth">
            <div style="display: inline-block;"
                 onclick="loadData(this);" class="tooth ${tooth.color}" id="${tooth.id}"
                 data-name="${tooth.name}">
            </div>
        </g:each>
    </div>
</div>