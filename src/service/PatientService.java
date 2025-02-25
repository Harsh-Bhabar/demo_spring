package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    // Convert Entity -> DTO
    private PatientDTO convertToDTO(Patient patient) {
        return new PatientDTO(patient.getName(), patient.getAge(), patient.getDisease());
    }

    // Convert DTO -> Entity
    private Patient convertToEntity(PatientDTO patientDTO) {
        return new Patient(patientDTO.getName(), patientDTO.getAge(), patientDTO.getDisease());
    }

    // Get all patients
    public List<PatientDTO> getAllPatients() {
        return patientRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Add a new patient
    public PatientDTO addPatient(PatientDTO patientDTO) {
        Patient savedPatient = patientRepository.save(convertToEntity(patientDTO));
        return convertToDTO(savedPatient);
    }
}
