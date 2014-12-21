package com.dental.service

import com.dental.domain.Role
import grails.transaction.Transactional

@Transactional
class RoleService {

    public static final String ROLE_ADMIN   = 'ROLE_ADMIN'
    public static final String ROLE_DENTIST = 'ROLE_DENTIST'
    public static final String ROLE_PATIENT = 'ROLE_PATIENT'

    def init() {
        new Role(authority: ROLE_DENTIST).save()
        new Role(authority: ROLE_PATIENT).save()
        new Role(authority: ROLE_ADMIN).save()
    }
}
