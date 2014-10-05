package com.dental.domain

class Rating {

    int points

    static belongsTo = [dentist: Dentist]

    static constraints = {
    }
}
