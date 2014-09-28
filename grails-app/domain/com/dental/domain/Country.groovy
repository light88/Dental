package com.dental.domain

class Country {

    String country

    static constraints = {
        country nullable: false, blank: false, unique: true
    }
}
