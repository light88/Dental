package com.dental.domain

class Dentist {


    Rating rating
    Profile profile

    static hasMany = [patients: Patient]

    static constraints = {
    }
}
