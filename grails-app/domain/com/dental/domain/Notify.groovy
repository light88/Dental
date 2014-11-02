package com.dental.domain

class Notify {

    String mail
    String description
    Date createdOn = new Date()
    boolean notified

    static constraints = {
        mail email: true, blank: false
        description blank: true, nullable: true
    }
}
