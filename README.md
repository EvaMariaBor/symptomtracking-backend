# symptomtracking-backend
Der **Symptomtracker** ist eine Java-Webanwendung, mit der gesundheitliche Beschwerden digital dokumentiert werden können. 
Jedes Symptom erfasst eine Bezeichnung, ein Datum, eine Beschreibung sowie die Stärke auf einer Skala von 1 bis 10.

Das Projekt ist so konzipiert, dass es schrittweise um folgende Funktionen erweitert werden kann:

* **Diagnosen-Matching:**
    * Zuordnung von erfassten Symptomen zu medizinischen Diagnosen (z. B. ICD-Kataloge, sobald eine Diagnose vorhanden ist).

* **KI-Analyse & Auswertung:**
    * Anbindung von Spring AI (z. B. OpenAI oder ein lokales LLM via Ollama) zur automatischen Analyse von Verläufen.
    * Generierung von Zusammenfassungen, Erkennung von wiederkehrenden Mustern und ersten Orientierungshilfen.

* **Multi-User-System & Arzt-Portal:**
    * Benutzerverwaltung mit verschiedenen Rollen (Patient vs. Arzt).
    * Sichere Freigabe von Symptom-Historien und Verläufen für behandelnde Ärzt:innen zur Unterstützung bei Anamnese und Diagnose.