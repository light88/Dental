package com.dental.controller.patient

import com.dental.domain.Dentist
import com.dental.domain.Patient

class PatientController {

    def patientService

    def index() {
        render 'patient list'
    }

    def springSecurityService

    def list() {
        def dentist = Dentist.findByProfile(springSecurityService.currentUser.profile)
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

    def newPatient(){
        render view: 'new'
    }

    def search() {
        println 'search $params'
        def name = params.name
        if(!name){
            return;
        }
        def dentist = Dentist.findByProfile(springSecurityService.currentUser.profile)
        def list = Patient.findByDentistAndFirstname(dentist, name)
        println list
        render template: 'patient_table', model: [patients : list]

    }
}
