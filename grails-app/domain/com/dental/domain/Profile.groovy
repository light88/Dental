package com.dental.domain

class Profile {

    String firstname
    String lastname
    String patronimic
    String phone

    Address address
    Rating rating

    static belongsTo = User

    static constraints = {
        phone nullable: true
        address nullable: true
    }
}
