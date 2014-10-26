package com.dental.service
import com.dental.domain.Dentist
import com.dental.domain.Mouth
import com.dental.domain.Patient
import com.dental.domain.Tooth
import grails.transaction.Transactional

@Transactional
class PatientService {

    def springSecurityService

    // TODO coding logic to save brand new patient
    def createPatient(params) {

        def dentist = Dentist.findByProfile(springSecurityService.currentUser.profile)

        if(!dentist)
            throw new NullPointerException("dentist is $dentist")

        params <<[dateOfBirth : new Date()]
        def patient = new Patient(params)
        def mouth = new Mouth()
        def range = 1..8

        range.each { i ->
            mouth.addToTeeth(new Tooth(name: "UL$i", color: 121, description: 'up left $i'))
        }
        range.each { i ->
            mouth.addToTeeth(new Tooth(name: "UR$i", color: 121, description: 'up right $i'))
        }
        range.each { i ->
            mouth.addToTeeth(new Tooth(name: "DL$i", color: 121, description: 'down left $i'))
        }
        range.each { i ->
            mouth.addToTeeth(new Tooth(name: "DR$i", color: 121, description: 'down right $i'))
        }

        patient.mouth = mouth
        dentist.addToPatients(patient)

        println dentist.validate()

        println "p validate = " + patient.validate()
        println "p error = " + patient.errors

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
