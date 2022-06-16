package org.example;

import java.time.LocalDateTime;
import java.util.Date;

public class Mutuo {
    private double valore;
    private Date scadenza;
    private String periodicità;

    public Mutuo(double valore, Date scadenza, String periodicità) {
        this.valore = valore;
        this.scadenza = scadenza;
        this.periodicità = periodicità;
    }

    public int getRate() {
        return 5;
    }

    public int getRateRimaste() {
        return 2;
    }
}
