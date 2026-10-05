package de.htw_berlin.symptomtracking;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SymptomController {

        @GetMapping("/")
        public List<Symptom> index() {
            return List.of(new Symptom("Kopfschmerzen"), new Symptom("Augenzucken"), new Symptom("Knieschmerzen"));
        }

    }
