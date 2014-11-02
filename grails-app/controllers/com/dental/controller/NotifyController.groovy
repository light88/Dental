package com.dental.controller

import grails.plugin.springsecurity.annotation.Secured

@Secured('permitAll')
class NotifyController {

    def notifyService

    def index() {}

    def addNotifyEmail(){
        if(notifyService.add(params)) {
            render 'OK'
        }else{
            render 'Fail'
        }
    }
}
