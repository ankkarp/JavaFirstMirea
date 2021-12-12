package ru.mirea.task26;

import java.util.ArrayList;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        CreditCard card = new CreditCard(12345678, 123, 1234, 200);
        EWallet wallet = new EWallet("Login12345", "Passw67890", 200);
        ArrayList<Item> order = new ArrayList<>();
        order.add(new Item("Хлеб", 59, 3 ));
        card.pay(order);
        wallet.pay(order);
        order.add(new Item("Молоко", 89, 2 ));
        order.add(new Item("Геркулес", 71, 1 ));
        card.pay(order);
        wallet.pay(order);
    }
}
