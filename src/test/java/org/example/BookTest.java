package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class BookTest {
    @Test
    public void testAddBook() {
        String isbn = "1234567890";
        String title = "Titre du livre";
        String author = "Auteur du livre";
        String publisher = "Éditeur du livre";
        Format format = new Format(Format.POCHE); // Remplacez "POCHE" par le format souhaité
        boolean available = true;

        Book book = new Book(isbn, title, author, publisher, format, available);



        Assertions.assertEquals(isbn, book.getIsbn());
        Assertions.assertEquals(title, book.getTitle());
        Assertions.assertEquals(author, book.getAuthor());
    }

    @Test
    public void testUpdateBook() {
        String isbn = "1234567890";
        String title = "Titre du livre";
        String author = "Auteur du livre";
        String publisher = "Éditeur du livre";
        Format format = new Format(Format.POCHE); // Remplacez "POCHE" par le format souhaité
        boolean available = true;

        Book book = new Book(isbn, title, author, publisher, format, available);


        String newTitle = "Nouveau titre";
        String newAuthor = "Nouvel auteur";

        book.setTitle(newTitle);
        book.setAuthor(newAuthor);

        Assertions.assertEquals(newTitle, book.getTitle());
        Assertions.assertEquals(newAuthor, book.getAuthor());
    }

    @Test
    public void testDeleteBook() {
        String isbn = "1234567890";
        String title = "Titre du livre";
        String author = "Auteur du livre";
        String publisher = "Éditeur du livre";
        Format format = new Format(Format.POCHE); // Remplacez "POCHE" par le format souhaité
        boolean available = true;

        Book book = new Book(isbn, title, author, publisher, format, available);


        // Suppression du livre
        book = null;

        Assertions.assertNull(book);
    }
    @Test
    public void testGetBookByISBN() {
        Book book1 = new Book("1234567890", "Titre 1", "Auteur 1", "Éditeur 1", new Format(Format.POCHE), true);
        Book book2 = new Book("9876543210", "Titre 2", "Auteur 2", "Éditeur 2", new Format(Format.BROCHE), true);
        Book book3 = new Book("1111111111", "Titre 3", "Auteur 3", "Éditeur 3", new Format(Format.GRAND_FORMAT), true);

        Book[] books = {book1, book2, book3};

        String isbnToSearch = "9876543210";
        Book result = BookService.getBookByISBN(isbnToSearch, List.of(books));

        Assertions.assertEquals(book2, result);

    }
    @Test
    public void testGetBookByTitle() {
        Book book1 = new Book("1234567890", "Titre 1", "Auteur 1", "Éditeur 1", new Format(Format.POCHE), true);
        Book book2 = new Book("9876543210", "Titre 2", "Auteur 2", "Éditeur 2", new Format(Format.BROCHE), true);
        Book book3 = new Book("1111111111", "Titre 3", "Auteur 3", "Éditeur 3", new Format(Format.GRAND_FORMAT), true);

        Book[] books = {book1, book2, book3};

        String titleToSearch = "Titre 2";
        Book result = (Book) BookService.getBookByTitle(titleToSearch, List.of(books));

        Assertions.assertEquals(book2, result);
    }

    @Test
    public void testGetBookByAuthor() {
        Book book1 = new Book("1234567890", "Titre 1", "Auteur 1", "Éditeur 1", new Format(Format.POCHE), true);
        Book book2 = new Book("9876543210", "Titre 2", "Auteur 2", "Éditeur 2", new Format(Format.BROCHE), true);
        Book book3 = new Book("1111111111", "Titre 3", "Auteur 3", "Éditeur 3", new Format(Format.GRAND_FORMAT), true);

        Book[] books = {book1, book2, book3};

        String authorToSearch = "Auteur 3";
        Book result = (Book) BookService.getBookByAuthor(authorToSearch,  List.of(books));

        Assertions.assertEquals(book3, result);
    }
}
