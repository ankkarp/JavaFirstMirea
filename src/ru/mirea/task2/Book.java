package ru.mirea.task2;

public class Book {
    private String author, title;
    private int year;

    public Book(String auth, String ttl, int yr){
        author = auth;
        title = ttl;
        year = yr;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String auth){
        author = auth;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String ttl){
        title = ttl;
    }

    public int getYear(){
        return year;
    }

    public void setYear(int yr){
        year = yr;
    }
}
