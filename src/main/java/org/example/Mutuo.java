package org.example;

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
}
