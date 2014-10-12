package com.dental.domain

class Tooth {

    String description
    boolean exist
    String name
    int color

    static hasMany = [teethTreatment : ToothTreatment]

    static belongsTo = [mouth: Mouth]

    static constraints = {
        exist defaultValue: true
    }
}
