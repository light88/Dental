package com.fitupness.service
import com.dental.domain.Profile
import grails.transaction.Transactional

@Transactional
class ProfileService {

    def springSecurityService

//    def Trainer getTrainer() {
//        Trainer.findByProfile springSecurityService.currentUser.profile
//    }
//
//    def Sportsman getSportsman() {
//        Sportsman.findByProfile springSecurityService.currentUser.profile
//    }

    def Profile getProfile() {
        springSecurityService.currentUser.profile
//        Profile.get(springSecurityService.currentUser.profile.id)
    }
}
