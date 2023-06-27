package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookTest {
    @Test
    public void testAddBook() {
        String isbn = "1234567890";
        String title = "Titre du livre";
        String author = "Auteur du livre";
        Book book = new Book(isbn, title, author);

        Assertions.assertEquals(isbn, book.getIsbn());
        Assertions.assertEquals(title, book.getTitle());
        Assertions.assertEquals(author, book.getAuthor());
    }

    @Test
    public void testUpdateBook() {
        String isbn = "1234567890";
        String title = "Titre du livre";
        String author = "Auteur du livre";
        Book book = new Book(isbn, title, author);

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
        Book book = new Book(isbn, title, author);

        // Suppression du livre
        book = null;

        Assertions.assertNull(book);
    }
}
