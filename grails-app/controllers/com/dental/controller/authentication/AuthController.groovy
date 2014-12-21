package com.dental.controller.authentication

import grails.plugin.springsecurity.SpringSecurityUtils
import grails.plugin.springsecurity.annotation.Secured
import grails.util.BuildSettings
import org.codehaus.groovy.runtime.DefaultGroovyMethodsSupport

@Secured('permitAll')
class AuthController {

    /**
     * Dependency injection for the springSecurityService.
     */
    def springSecurityService

    /**
     * authService for signup new user
     */
    def authService

    /**
     * Entry point
     * @return
     */
    def index() {
//        println springSecurityService.getAuthentication().isAuthenticated()
//        println "$controllerName, $actionName"

        if (springSecurityService.isLoggedIn()) {
            redirect uri: SpringSecurityUtils.securityConfig.successHandler.defaultTargetUrl
        } else {
            redirect action: 'login', params: params
        }
    }

    /**
     * Show the login page.
     */
    def login() {

        println "++ $grailsApplication.config.dental"

        def config = SpringSecurityUtils.securityConfig
        if (springSecurityService.isLoggedIn()) {
            redirect uri: config.successHandler.defaultTargetUrl
            return
        }

        String view = 'login'

        String postUrl = "${request.contextPath}${config.apf.filterProcessesUrl}"

        println "post url = $postUrl"
        render view: view, model: [postUrl            : postUrl,
                                   rememberMeParameter: config.rememberMe.parameter]
    }

    def signup() {
        render view: 'signup'
    }

    def doSignup() {
        try {
            def user = authService.signup(params)
            flash.succed = 'Signup completed'
            redirect action: 'login'
        } catch (e) {
            flash.errors = e.errors
            redirect action: 'signup'
        }
    }

    def authfail() {

    }

    def doLogin() {
        println params
    }

    def doLogout() {

    }

    def logout() {
        println 'logout'
    }
}
