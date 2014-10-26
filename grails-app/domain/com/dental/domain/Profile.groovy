package com.dental.domain

class Profile {

    String firstname
    String lastname
    String patronimic
    String phone
    byte gender
    Date dateOfBirth

    Address address

    static belongsTo = User //[only create an instanceof profile when User is saved]

    static constraints = {
        phone nullable: true
        address nullable: true
        dateOfBirth defaultValue : new Date()
    }
}
