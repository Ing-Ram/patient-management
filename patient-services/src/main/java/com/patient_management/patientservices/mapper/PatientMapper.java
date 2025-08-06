package com.patient_management.patientservices.mapper;

import com.patient_management.patientservices.dto.PatientResponseDTO;
import com.patient_management.patientservices.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setFirstName(patient.getFirstname().toString());
        patientDTO.setMiddleName(patient.getMiddlename().toString());
        patientDTO.setLastName(patient.getLastname().toString());
        patientDTO.setAddress(patient.getAddress().toString());
        patientDTO.setEmail(patient.getEmail().toString());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDTO;
    }
}
