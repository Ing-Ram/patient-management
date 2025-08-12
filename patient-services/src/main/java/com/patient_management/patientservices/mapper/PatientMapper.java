package com.patient_management.patientservices.mapper;

import com.patient_management.patientservices.dto.PatientResponseDTO;
import com.patient_management.patientservices.model.Patient;

public class PatientMapper {
    public static PatientResponseDTO toDTO(Patient patient) {
        PatientResponseDTO patientDTO = new PatientResponseDTO();
        patientDTO.setId(patient.getId().toString());
        patientDTO.setFirstName(patient.getFirstname());
        patientDTO.setMiddleName(patient.getMiddlename());
        patientDTO.setLastName(patient.getLastname());
        patientDTO.setAddress(patient.getAddress());
        patientDTO.setEmail(patient.getEmail());
        patientDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return patientDTO;
    }
}
