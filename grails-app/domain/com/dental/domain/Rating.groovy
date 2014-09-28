package com.dental.domain

class Rating {

    int points

    static belongsTo = [profile: Profile]

    static constraints = {
    }
}
