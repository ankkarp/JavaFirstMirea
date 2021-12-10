package ru.mirea.task22;

public class Client implements Chair{
    public void sit(ChairType type){
        Chair chair = null;

        switch (type) {
            case VICTORIAN:
                chair = new Victorian();
                break;
            case MULTIFUNCTIONAL:
                chair = new Multifunctional();
                break;
            case MAGICAL:
                chair = new Magical();
                break;
        }
        System.out.println("You are sitting on a " + chair);
    }
}
