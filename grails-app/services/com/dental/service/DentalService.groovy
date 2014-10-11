package com.dental.service

import com.dental.domain.Dentist
import grails.transaction.Transactional

@Transactional
class DentalService {

    def springSecurityService

    def dentist() {
        Dentist.findByProfile(springSecurityService.currentUser.profile)
    }
}
