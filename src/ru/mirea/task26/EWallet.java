package ru.mirea.task26;

import java.util.ArrayList;
import java.util.Scanner;

public class EWallet extends Payment implements PaymentMethod {
    private String login;
    private String password;

    public EWallet(String login, String password, int balance) {
        super(balance);
        this.login = login;
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public boolean pay(ArrayList<Item> order_list){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nВведите логин");
        if (!login.equals(sc.nextLine())) {
            System.out.println("Неверный логин");
            return false;
        }
        System.out.println("Введите пароль");
        if (!password.equals(sc.nextLine())) {
            System.out.println("Неверный пароль");
            return false;
        }
        Order order = new Order(order_list);
        if (order.getSum() <= balance){
            System.out.println("Ваш заказ оплачен");
            balance -= order.getSum();
            order.printCheck();
            return true;
        }
        else{
            System.out.println("Недостаточно средств");
            return false;
        }
    }
}
