package com.fitupness.service
import com.dental.domain.Dentist
import com.dental.domain.Mouth
import com.dental.domain.Patient
import grails.transaction.Transactional

@Transactional
class PatientService {

    def springSecurityService

    // TODO coding logic to save brand new patient
    def createPatient(params) {
        def dentist = Dentist.findByProfile(springSecurityService.currentUser.profile)

        if(!dentist)
            throw new NullPointerException("dentist is $dentist")

        params << [dateOfBirth : new Date()]
        def patient = new Patient(params)

        patient.mouth = new Mouth()
//        patient.save(flush: true)

        dentist.addToPatients(patient)

        println patient.validate()
        println dentist.validate()

        if(dentist.save()){
            println dentist.errors

            println 'ok'
            return true
        }else
            println dentist.errors

//        println res
//        return res

    }
}
