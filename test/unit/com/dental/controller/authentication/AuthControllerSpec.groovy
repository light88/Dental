package com.dental.controller.authentication

import grails.plugin.springsecurity.SpringSecurityService
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.support.GrailsUnitTestMixin} for usage instructions
 */

@TestFor(AuthController)
@Mock(SpringSecurityService)
class AuthControllerSpec extends Specification {

    def setup() {

    }

    def cleanup() {
    }

    void "test something"() {
    }

    void "auth controller, index redirect login"() {

        when: 'user is not logged in'
            def mockSecurityService = mockFor(SpringSecurityService)
    //      mockSecurityService.demand.isLoggedIn >> { return false }
    //      def mock = mockSecurityService.createMock()

            def mockObj = mockSecurityService.createMock()

            mockObj = [isLoggedIn: { return false }]

            controller.springSecurityService = mockObj
            controller.index()

        then: 'go to the login page'
            controller.response.redirectedUrl.contains 'login'
    }

    void "auth controller, index redirect home"() {
        when: 'user is logged in'
            def mockSecurityService = mockFor(SpringSecurityService)
            def mockObj = mockSecurityService.createMock()
            mockObj = [isLoggedIn: { return true }]

            controller.springSecurityService = mockObj
            controller.index()

        then: 'go to the home page'
            controller.response.redirectedUrl.contains 'home/index'
    }
}
