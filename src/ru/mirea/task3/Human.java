package ru.mirea.task3;

public class Human {
    public static void main(String[] args){
        ru.mirea.task3.Head head = new ru.mirea.task3.Head("black", "hazel");
        ru.mirea.task3.Hand hand = new ru.mirea.task3.Hand("short", "little");
        Leg leg = new Leg("short", "average-built");
        System.out.print("It is a human with "+head.getHairColor()+" hair, "+head.getEyeColor()+" eyes, "+hand.getSize()
                +" hands with "+hand.getFingerLength()+" fingers and "+leg.getLength()+" "+leg.getBuild()+" legs");
    }
}
