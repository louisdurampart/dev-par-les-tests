package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class AdherentTest {

    @Test
    public void testCreateAdherent() {
        String code = "001";
        String nom = "Dupont";
        String prenom = "Jean";
        Date date = new Date();
        String civilite = "Monsieur";

        Adherent adherent = new Adherent(code, nom, prenom, date, civilite);

        Assertions.assertEquals(code, adherent.getCode());
        Assertions.assertEquals(nom, adherent.getNom());
        Assertions.assertEquals(prenom, adherent.getPrenom());
        Assertions.assertEquals(date, adherent.getDate());
        Assertions.assertEquals(civilite, adherent.getCivilite());
    }
}
