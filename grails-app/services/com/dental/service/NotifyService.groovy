package com.dental.service

import com.dental.domain.Notify
import grails.transaction.Transactional

@Transactional
class NotifyService {

    def add(params){
        def notify = new Notify(params)
        return notify.save(flush: true)
    }

    def sendNotify(id){}

    def sendNotifyAll(){}
}
