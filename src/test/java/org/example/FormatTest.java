package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FormatTest {

    @Test
    public void testValidFormat() {
        String validFormat = "Poche";
        Format format = new Format(validFormat);

        String result = format.getFormat();

        Assertions.assertEquals(validFormat, result);
    }

    @Test
    public void testInvalidFormat() {
        String invalidFormat = "Format invalide";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Format(invalidFormat);
        });
    }

    @Test
    public void testSetValidFormat() {
        Format format = new Format("Poche");
        String newValidFormat = "Broché";

        format.setFormat(newValidFormat);

        String result = format.getFormat();
        Assertions.assertEquals(newValidFormat, result);
    }

    @Test
    public void testSetInvalidFormat() {
        Format format = new Format("Poche");
        String invalidFormat = "Format invalide";

        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            format.setFormat(invalidFormat);
        });

        // Vérifie que le format n'a pas été modifié
        String result = format.getFormat();
        Assertions.assertEquals("Poche", result);
    }
}
