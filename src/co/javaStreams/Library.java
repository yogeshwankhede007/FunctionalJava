package co.javaStreams;

import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {
        ArrayList<Book> books = populateLibrary();
        books.stream().filter(book -> {
            return book.getAuthor().startsWith("j");
        }).filter(book -> {
       return book.getTitle().startsWith("T");
        }).forEach(System.out::println);

        //Parallel stream
        books.parallelStream().filter(book -> {
            return book.getAuthor().startsWith("j");
                }).forEach(System.out::println);
    }

    private static ArrayList<Book> populateLibrary() {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Alice Walker","The Color"));
        books.add(new Book("Tony","Reloved"));
        books.add(new Book("john","jazz"));
        books.add(new Book("john","The grapes"));
        books.add(new Book("Kazuo","East of Eden"));
        return books;
    }
}
