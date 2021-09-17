package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        ru.mirea.task4.Author author = new ru.mirea.task4.Author(" А. А. Карпова", "karpova@gmail.com", 'ж');
        System.out.println(author);
        author.setEmail("karpova@mail.ru");
        System.out.println(author);
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
    }
}
