package de.htw_berlin.symptomtracking;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SymptomService {

    private final SymptomRepository repository;

    public SymptomService(SymptomRepository repository) {
        this.repository = repository;
    }

    public List<Symptom> getAll() {
        return repository.findAll();
    }

    public Symptom get(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Symptom save(Symptom symptom) {
        return repository.save(symptom);
    }
}