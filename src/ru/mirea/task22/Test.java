package ru.mirea.task22;

public class Test implements Chair{
    public static void main(String[] args) {
        Client client = new Client();
        client.sit(ChairType.MAGICAL);
        client.sit(ChairType.MULTIFUNCTIONAL);
        client.sit(ChairType.VICTORIAN);
    }
}
