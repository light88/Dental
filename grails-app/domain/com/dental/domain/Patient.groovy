package com.dental.domain

class Patient {

    String firstname
    String lastname
    String patronimic
    String phone
    byte gender
    Date dateOfBirth

    Address address
    Mouth mouth

    static belongsTo = [dentist : Dentist]

    static constraints = {
        phone nullable: true
        address nullable: true
        dateOfBirth defaultValue : new Date()
    }
}
