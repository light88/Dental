package com.dental.service

import com.dental.domain.*
import grails.transaction.Transactional

@Transactional
class AuthService {

    def signup(params) {

        params << [gender : true, dateOfBirth : new Date()]
        def user = new User(params)

        def profile = new Profile(params)
        profile.save(flush: true)

        def rating = new Rating()
        rating.save()

        def dentist = new Dentist(profile: profile, rating: rating)
        dentist.save()

        user.profile = profile

        if (user.validate() /*&& profile.validate()*/) {
            user.save(flush: true)

            def roleSportsman = Role.findByAuthority("ROLE_DENTIST")
            UserRole.create(user, roleSportsman, true)
            return user
        } else {
            if (user.hasErrors()) {
                user.errors.each { error ->
                    println error
                }
            }
            //throw new RuntimeException('Error signup...')
        }
        return user
    }
}
