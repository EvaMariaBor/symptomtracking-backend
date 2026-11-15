package de.htw_berlin.symptomtracking;

import java.time.LocalDate;

public class Symptom {
    private String bezeichnung;
    private LocalDate datum;
    private String beschreibung;
    private int staerke;

    public Symptom() {
    }

    public Symptom(String bezeichnung, LocalDate datum, String beschreibung, int staerke) {
        this.bezeichnung = bezeichnung;
        this.datum = datum;
        this.beschreibung = beschreibung;
        this.staerke = staerke;
    }

    public int getStaerke() {
        return staerke;
    }

    public void setStaerke(int staerke) {
        this.staerke = staerke;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }
}
