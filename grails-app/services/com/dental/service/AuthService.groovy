package com.dental.service

import com.dental.domain.*
import grails.transaction.Transactional

@Transactional
class AuthService {

    def signup(params) {

        println "params -- ${params}"

        def user = new User(params)

        def profile = new Profile(params)

        profile.dateOfBirth = new Date()
        profile.save(flush: true, failOnError: true)

        def rating = new Rating()
        rating.save(flush: true)

        def dentist = new Dentist(profile: profile, rating: rating)
        dentist.save(failOnError: true)

        user.profile = profile
        user.save(flush: true, failOnError: true)

        def roleDentist = Role.findByAuthority(RoleService.ROLE_DENTIST)
        UserRole.create(user, roleDentist, true)
        return user
    }

}
