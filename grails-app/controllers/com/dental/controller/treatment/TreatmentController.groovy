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
        def tooth = Tooth.get(params.id)

        println '+++'+params
        tooth.addToTeethTreatment(new ToothTreatment(treatment: params.treatment,
                date: new Date(), dentist: dentist))
        tooth.save(flush: true)
        def list = ToothTreatment.findAllByTooth(tooth).sort {t->t.date}.reverse()
        render template: 'template_treatment_list', model: [treatments : list]
    }

    def treatInfo(){
        println params.id
        def tooth = Tooth.get(params.id)
        def list = ToothTreatment.findAllByTooth(tooth).sort {t->t.date}.reverse()
        render template: 'template_treatment_list', model: [treatments : list]
    }
}
