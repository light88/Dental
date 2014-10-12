package com.dental.controller.patient
import com.dental.domain.Patient
import com.dental.domain.Tooth
import com.dental.domain.ToothTreatment

class PatientController {

    static allowedMethods = [create: "POST", treat: "POST"]

    static defaultAction = "list"

    def patientService
    def dentalService

    final int PER_PAGE = 3;

    def list() {
        def dentist = dentalService.dentist()
//        def page = params.page
        render view: 'list', model: [
                patients: Patient.findAllByDentist(dentist, params), size: dentist.patients.size()]
    }

    def create() {
        println params
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
        def p = dentist.patients.find { it.id == params.long("id", 0L) }
        if (!p) {
            response.sendError(404)
            return
        }
        [patient: p]
    }

    def treat() {
        def dentist = dentalService.dentist()
        def p = dentist.patients.find { it.id == params.long("id", 0L) }

        def t = Tooth.get(params.id)
        t.addToTeethTreatment(new ToothTreatment(treatment: params.treatment, date: new Date()))
        t.save(flush: true)
        println params
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
