package com.dental.service

import com.dental.domain.Currency
import com.dental.domain.ServicePrice
import grails.transaction.Transactional
import org.codehaus.groovy.grails.web.servlet.mvc.GrailsParameterMap

@Transactional
class ServicePriceService {

    def dentalService

    def addService(params){
println params
        def currency = Currency.get(params.currency)
        if(!currency)
            throw new IllegalArgumentException('Incorrect currency id' + params.currency)

        def servicePrice = new ServicePrice(currency: currency, service: params.service,
                price: params.price)


        def dentist = dentalService.dentist()
        println servicePrice
        dentist.addToServices(servicePrice)
        dentist.save(failOnError: true)
        servicePrice
    }

    def list(params) {
        def dentist = dentalService.dentist()
        dentist.services
    }
}
