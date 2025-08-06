package com.patient_management.patientservices.service;


import com.patient_management.patientservices.dto.PatientResponseDTO;
import com.patient_management.patientservices.mapper.PatientMapper;
import com.patient_management.patientservices.model.Patient;
import com.patient_management.patientservices.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();
        List<PatientResponseDTO> patientResponseDTOs = patients.stream().map(PatientMapper::toDTO).toList();

        return patientResponseDTOs;
    }


}
