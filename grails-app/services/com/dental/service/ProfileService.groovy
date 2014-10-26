package com.dental.service
import com.dental.domain.Profile
import grails.transaction.Transactional

@Transactional
class ProfileService {

    def springSecurityService

    def Profile getProfile() {
        springSecurityService.currentUser.profile
//        Profile.get(springSecurityService.currentUser.profile.id)
    }
}
