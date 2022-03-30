package org.example.domain;

import java.util.Objects;

public class Ornament {
    private String naam;
    private String omschrijving;
    private String kleur;
    private boolean kanOpLuchtpomp;

    public Ornament(String naam, String omschrijving, String kleur, boolean kanOpLuchtpomp) {
        this.naam = naam;
        this.omschrijving = omschrijving;
        this.kleur = kleur;
        this.kanOpLuchtpomp = kanOpLuchtpomp;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam == null) {
            throw new IllegalArgumentException("naam kan niet null zijn.");
        }
        this.naam = naam;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        this.kleur = kleur;
    }

    public boolean isKanOpLuchtpomp() {
        return kanOpLuchtpomp;
    }

    public void setKanOpLuchtpomp(boolean kanOpLuchtpomp) {
        this.kanOpLuchtpomp = kanOpLuchtpomp;
    }

    @Override
    public String toString() {
        return "Ornament{" +
                "naam='" + naam + '\'' +
                ", omschrijving='" + omschrijving + '\'' +
                ", kleur='" + kleur + '\'' +
                ", kanOpLuchtpomp=" + kanOpLuchtpomp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ornament)) return false;
        Ornament ornament = (Ornament) o;
        return getNaam().equals(ornament.getNaam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaam());
    }
}
