package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ISBMValidatorTest {

    @Test
    public void checkValidSBMCode() {
        ISBMValidator validator = new ISBMValidator();
        boolean result = validator.validateISBNCode("2822901058");
        assertTrue(result);
    }
    @Test
    public void checkInvalidSBMCode() {
        ISBMValidator validator = new ISBMValidator();
        boolean result = validator.validateISBNCode("2019463195");
        assertFalse(result);
    }

    @Test
    public void invalidLengthShouldThrowException() {
        ISBMValidator validator = new ISBMValidator();
        assertThrows(NumberFormatException.class, () -> validator.validateISBNCode("123456789"));
    }

}