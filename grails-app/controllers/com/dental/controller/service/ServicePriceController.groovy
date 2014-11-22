package com.dental.controller.service

class ServicePriceController {


    def servicePriceService

    def index() {
        [currency : com.dental.domain.Currency.list()]
    }

    def add() {
        try {
            def id = servicePriceService.addService(params)
            render  "serviceprice id = $id"
        } catch (e) {
            render "fail $e.message"
        }
    }

    def list(){
        def services = servicePriceService.list(params)
        [services : services]
    }
}
