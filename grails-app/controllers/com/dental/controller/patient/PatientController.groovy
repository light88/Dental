package com.dental.controller.patient

import com.dental.domain.Patient

class PatientController {

    static defaultAction = "list"

    def patientService
    def dentalService

    def list() {
        def dentist = dentalService.dentist()
        render view: 'list', model: [dentist: dentist, patients: dentist.patients]
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
            list = Patient.findByDentistAndFirstname(dentist, name)
        else
            list = dentist.patients

        render template: 'patient_table', model: [patients: list]
    }
}
