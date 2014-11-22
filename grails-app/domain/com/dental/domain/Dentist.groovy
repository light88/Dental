package com.dental.domain

class Dentist {

    Rating rating
    Profile profile

    static hasMany = [patients: Patient,
                      services : ServicePrice]

    static mapping = {
        patients lazy: false
    }

    static constraints = {

    }
}
