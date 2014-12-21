package com.dental.domain

class ServicePrice {

    Dentist dentist
    String service
    Double price
    Currency currency

    static constraints = {

    }

    static mapping = {
        price defaultValue : 0
    }
}
