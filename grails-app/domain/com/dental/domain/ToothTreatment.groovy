package com.dental.domain

class ToothTreatment {

    String treatment
    Date date
//    Tooth tooth

    static belongsTo = [tooth : Tooth]

    static mapping = {
        treatment sqlType: 'text'
    }

    static constraints = {
    }
}
