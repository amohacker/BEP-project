package org.example.domain;

import java.util.Objects;

public class Toebehoren {
    private String model;
    private int serienummer;
    private String omschrijving;

    public Toebehoren(String model, int serienummer, String omschrijving) {
        this.model = model;
        this.serienummer = serienummer;
        this.omschrijving = omschrijving;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSerienummer() {
        return serienummer;
    }

    public void setSerienummer(int serienummer) {
        if (serienummer == 0) {
            throw new IllegalArgumentException("serienummer kan niet 0/null zijn");
        }
        this.serienummer = serienummer;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public void setOmschrijving(String omschrijving) {
        this.omschrijving = omschrijving;
    }

    @Override
    public String toString() {
        return "Toebehoren{" +
                "model='" + model + '\'' +
                ", serienummer=" + serienummer +
                ", omschrijving='" + omschrijving + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Toebehoren)) return false;
        Toebehoren that = (Toebehoren) o;
        return getSerienummer() == that.getSerienummer();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSerienummer());
    }
}
