package ru.mirea.task2;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);
        dog.setAge(3);
        dog.setBreed("бульдог");
        dog.setFurColor("коричневый");
        System.out.println(dog);
        System.out.println(dog.getAge());
        System.out.println(dog.getBreed());
        System.out.println(dog.getFurColor());
    }
}
