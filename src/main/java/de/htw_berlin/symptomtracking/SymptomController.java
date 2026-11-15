package de.htw_berlin.symptomtracking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SymptomController {

    @Autowired
    SymptomService service;

    Logger logger = LoggerFactory.getLogger(SymptomController.class);

    // Neues Symptom speichern (POST)
    @CrossOrigin
    @PostMapping("/symptoms")
    public Symptom createSymptom(@RequestBody Symptom symptom) {
        logger.info("POST request to create symptom: {}", symptom.getBezeichnung());
        return service.save(symptom);
    }

    // Einzelnes Symptom über ID abrufen (GET mit PathVariable)
    @CrossOrigin
    @GetMapping("/symptoms/{id}")
    public Symptom getSymptom(@PathVariable String id) {
        logger.info("GET request on route symptoms with id: {}", id);
        Long symptomId = Long.parseLong(id);
        return service.get(symptomId);
    }

    // Alle Symptome abrufen (GET)
    @CrossOrigin
    @GetMapping("/symptoms")
    public List<Symptom> getAllSymptoms() {
        logger.info("GET request to fetch all symptoms");
        return service.getAll();
    }

    }
