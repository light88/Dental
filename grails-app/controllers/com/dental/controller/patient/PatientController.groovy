package com.dental.controller.patient
import com.dental.domain.Patient

class PatientController {

    static allowedMethods = [create: "POST"]
    static defaultAction = "list"

    def patientService
    def dentalService

    def list() {
        def dentist = dentalService.dentist()
        render view: 'list', model: [patients: Patient.findAllByDentist(dentist, params),
                                     size: dentist.patients.size()]
    }

    def create() {
        if (patientService.createPatient(params)) {
            redirect action: 'list'
            return
        }
        render 'error'
    }

    /**
     * Opens page to create newpatient
     * @return newpatient page
     */
    def newPatient() {
        render view: 'new'
    }

    /**
     * Make filtering of patients by firstname
     * @return filtering template with found patients
     */
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

    /**
     * Show dentist patient with provided id
     * @return patient with provided id
     */
    def show() {
        def dentist = dentalService.dentist()
        def patient = dentist.patients.find { it.id == params.long("id", 0L) }
        if (!patient) {
            response.sendError(404)
            return
        }
        [patient: patient]
    }
}
