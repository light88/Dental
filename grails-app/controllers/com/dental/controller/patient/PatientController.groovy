package com.dental.controller.patient

import com.dental.domain.Patient

class PatientController {

    static defaultAction = "list"

    def patientService
    def dentalService

    final int PER_PAGE = 3;

    def list() {
        def dentist = dentalService.dentist()
//        def page = params.page
        render view: 'list', model: [
                patients: Patient.findAllByDentist(dentist, params), size : dentist.patients.size()]
    }

    def create() {
        println params
        if (patientService.createPatient(params)) {
            redirect action: 'list'
            return
        }
        render 'error'
    }

    def newPatient() {
        render view: 'new'
    }

    def search() {
        def name = params.name
        def dentist = dentalService.dentist()

        def list
        if (name)
            list = Patient.findByDentistAndFirstnameLike(dentist, name)
        else
            list = dentist.patients

        render template: 'patient_table', model: [patients: list]
    }
}
