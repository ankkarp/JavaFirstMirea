package ru.mirea.task2;

public class BookTest {
    public static void main(String[] args){
        Book book = new Book("Н. В. Зорина, Л. Б. Зорин, В.Л. Хлебникова", "ОБЪЕКТНО-ОРИЕНТИРОВАННОЕ " +
                "ПРОГРАММИРОВАНИЕ", 2018);
        System.out.print(book.getTitle()+" авторства "+book.getAuthor()+" "+book.getYear()+"г.");
    }
}
