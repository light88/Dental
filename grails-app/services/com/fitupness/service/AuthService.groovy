package com.fitupness.service

import com.dental.domain.*
import grails.transaction.Transactional

@Transactional
class AuthService {

    def signup(params) {

        def user = new User(params)
        def profile = new Profile(params)
        profile.save(flush: true)
        profile.rating = new Rating(points: 0)
        profile.rating.validate()
        profile.save(flush: true)
        user.profile = profile
        if (user.validate() /*&& profile.validate()*/) {
            user.save(flush: true)

            def roleSportsman = Role.findByAuthority("ROLE_USER")
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
