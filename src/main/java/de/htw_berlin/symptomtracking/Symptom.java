package de.htw_berlin.symptomtracking;

import java.time.LocalDate;

public class Symptom {
    private String bezeichnung;
    private LocalDate datum;
    private String beschreibung;
    private int staerke;

    public Symptom(String bezeichnung) {
        this.bezeichnung = bezeichnung;
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
