package org.example.domain;

import java.util.Objects;

public class Bewoner {
    private String soortnaam;
    private String kleurNaam;
    private int aantal;
    private boolean groepsDier;
    private String type;

    public Bewoner(String soortnaam, String kleurNaam, int aantal, boolean groepsDier, String type) {
        this.soortnaam = soortnaam;
        this.kleurNaam = kleurNaam;
        this.aantal = aantal;
        this.groepsDier = groepsDier;
        this.type = type;
    }

    public void verhoogAantal(int verhoging) { // Verhoogt aantal met de gegeven integer, werkt ook met negative hoeveelheden
        this.aantal += verhoging;
    }

    public String getSoortnaam() {
        return soortnaam;
    }

    public void setSoortnaam(String soortnaam) {
        this.soortnaam = soortnaam;
    }

    public String getKleurNaam() {
        return kleurNaam;
    }

    public void setKleurNaam(String kleurNaam) {
        this.kleurNaam = kleurNaam;
    }

    public int getAantal() {
        return aantal;
    }

    public void setAantal(int aantal) {
        this.aantal = aantal;
    }

    public boolean isGroepsDier() {
        return groepsDier;
    }

    public void setGroepsDier(boolean groepsDier) {
        this.groepsDier = groepsDier;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bewoner{" +
                "soortnaam='" + soortnaam + '\'' +
                ", kleurNaam='" + kleurNaam + '\'' +
                ", aantal=" + aantal +
                ", groepsDier=" + groepsDier +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bewoner)) return false;
        Bewoner bewoner = (Bewoner) o;
        return getSoortnaam().equals(bewoner.getSoortnaam()) && getKleurNaam().equals(bewoner.getKleurNaam());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSoortnaam(), getKleurNaam());
    }
}
