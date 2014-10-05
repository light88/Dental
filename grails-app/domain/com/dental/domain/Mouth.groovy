package com.dental.domain

class Mouth {

    static hasMany = [teeth: Tooth]
    static belongsTo = Patient
    static constraints = {
    }
}
