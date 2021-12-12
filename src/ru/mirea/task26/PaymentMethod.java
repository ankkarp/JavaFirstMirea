package ru.mirea.task26;

import java.util.ArrayList;

public interface PaymentMethod {
    boolean pay(ArrayList<Item> order_list);
}
