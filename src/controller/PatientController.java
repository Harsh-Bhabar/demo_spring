package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    // GET API - Fetch all patients
    @GetMapping
    public List<PatientDTO> getPatients() {
        return patientService.getAllPatients();
    }

    // GET API - Fetch patient by ID
    @GetMapping("/{id}")
    public PatientDTO getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    // POST API - Add a new patient
    @PostMapping
    public PatientDTO addPatient(@RequestBody PatientDTO patientDTO) {
        return patientService.addPatient(patientDTO);
    }
}
