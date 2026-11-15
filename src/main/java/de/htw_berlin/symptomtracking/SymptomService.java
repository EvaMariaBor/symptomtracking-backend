package de.htw_berlin.symptomtracking;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class SymptomService {
    // Temporäre In-Memory-Liste als Ersatz, solange noch keine Datenbank angebunden ist
    private final List<Symptom> symptoms = new ArrayList<>(List.of(
            new Symptom("Kopfschmerzen", LocalDate.now(), "pochend", 6),
            new Symptom("Augenzucken", LocalDate.now(), "rechts", 3)
    ));
    private long nextId = 3L;

    public List<Symptom> getAll() {
        return symptoms;
    }

    public Symptom get(Long id) {
        // Einfache Suche (wird später durch JPA Repository ersetzt)
        return symptoms.stream()
                .findFirst()
                .orElse(null);
    }

    public Symptom save(Symptom symptom) {
        symptoms.add(symptom);
        return symptom;
    }
}
