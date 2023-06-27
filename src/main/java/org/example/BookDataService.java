package org.example;

public interface BookDataService {
    Book getBookData(String isbn);

    void saveBook(Book book);
}
