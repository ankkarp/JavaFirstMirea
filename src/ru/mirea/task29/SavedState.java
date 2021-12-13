package ru.mirea.task29;

import java.io.Serializable;

public class SavedState implements Serializable {
    private CurrencyInfo currencyInfo;

    public SavedState(CurrencyInfo currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    public CurrencyInfo getCurrencyInfo() {
        return currencyInfo;
    }

    public void setCurrencyInfo(CurrencyInfo currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    @Override
    public String toString() {
        return "SavedState{" +
                "currencyInfo=" + currencyInfo +
                '}';
    }
}
