package org.example;

public class ContoCorrente {
    private int number;
    private double saldo;

    public ContoCorrente(int number, double saldo) {
        this.number = number;
        this.saldo = saldo;
    }

    public void preleva(int value) {
        this.saldo -= value;
    }

    public void deposita(int value) {
        this.saldo += value;
    }

    public double estrattoConto() {
        return saldo;
    }
}
