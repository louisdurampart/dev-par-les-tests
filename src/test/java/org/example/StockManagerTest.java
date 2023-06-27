package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;



import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class StockManagerTest {

    BookDataService mockDbService;
    BookDataService mockWebService;
    StockManager manager;

    @BeforeEach
    public void initMocks(){
        mockDbService = mock(BookDataService.class);
        mockWebService = mock(BookDataService.class);

        manager = new StockManager();
        manager.setDatabaseBookDataService(mockDbService);
        manager.setWebBookService(mockWebService);
    }
    @Test
    public void testSaveBookToDatabase_BookMissingInDatabase() {
        // Créez un livre avec les informations manquantes
        String isbn = "1234567890";
        String title = null; // Titre manquant
        String author = "Auteur du livre";
        String publisher = null; // Éditeur manquant
        Format format = new Format(Format.POCHE); // Format du livre
        boolean available = true; // Disponibilité du livre
        Book webBook = new Book(isbn, title, author, publisher, format, available);

        // renvoie le livre
        when(mockWebService.getBookData(isbn)).thenReturn(webBook);

        // Appelez la méthode de sauvegarde du livre dans le StockManager
        manager.saveBookToDatabase(isbn);

        // Vérifiez que le mock du service de données de la base de données a été appelé pour sauvegarder le livre
        verify(mockDbService).saveBook(webBook);
    }

    // Ajoutez d'autres tests pour couvrir différents scénarios, y compris les cas où le livre est déjà présent dans la base de données ou n'est pas trouvé dans le service web
}

