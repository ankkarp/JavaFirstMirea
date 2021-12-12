package ru.mirea.task26;

import java.util.ArrayList;
import java.util.Scanner;

public class CreditCard extends Payment implements PaymentMethod{
    private int cardNumber, cvc, expirationDate, balance;

    public CreditCard(int cardNumber, int cvc, int expirationDate, int balance) {
        super(balance);
        this.cardNumber = cardNumber;
        this.cvc = cvc;
        this.expirationDate = expirationDate;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean pay(ArrayList<Item> order_list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите номер карты");
        if (!Integer.toString(cardNumber).equals(sc.nextLine())) {
            System.out.println("Неверный номер карты");
            return false;
        }
        System.out.println("Введите CVC");
        if (!Integer.toString(cvc).equals(sc.nextLine())) {
            System.out.println("Неверный CVC");
            return false;
        }
        System.out.println("Введите срок действия");
        if (!Integer.toString(expirationDate).equals(sc.nextLine())) {
            System.out.println("Неверный срок действия");
            return false;
        }
        Order order = new Order(order_list);
        System.out.println("Ваш заказ оплачен");
        balance -= order.getSum();
        order.printCheck();
        return true;
    }
}
