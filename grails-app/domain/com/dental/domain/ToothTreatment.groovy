package com.dental.domain

class ToothTreatment {

    String treatment
    Date date
    Dentist dentist

    static belongsTo = [tooth : Tooth]

    static mapping = {
        treatment sqlType: 'text'
    }

    static constraints = {
    }
}
