package ru.mirea.task29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private String currency;
    private double value;

    public CurrencyInfo(String currency, double value) {
        this.currency = currency;
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "CurrencyInfo{" +
                "currency='" + currency + '\'' +
                ", value=" + value +
                '}';
    }
}
