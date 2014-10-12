package com.dental.controller.treatment

import com.dental.domain.Tooth
import com.dental.domain.ToothTreatment

class TreatmentController {

    static allowedMethods = [treat: "POST"]

    def dentalService

    def treat() {
        def dentist = dentalService.dentist()
        def p = dentist.patients.find { it.id == params.long("id", 0L) }
        println p
        def t = Tooth.get(params.id)

        t.addToTeethTreatment(new ToothTreatment(treatment: params.treatment, date: new Date()))
        t.save(flush: true)
        render "OK"
    }

    def treatInfo(){
        println params.id
        def tooth = Tooth.get(params.id)
        def list = ToothTreatment.findAllByTooth(tooth)
        println list
        render template: 'tooth_table', model: [treatments : list]
    }
}
