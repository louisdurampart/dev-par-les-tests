package org.example;

public class ISBMValidator {

    public boolean validateISBNCode(String isbn){
        if (isbn.length() != 10) throw new NumberFormatException("An ISBN length should have 10 chars");

        int total = 0;

        for (int i = 0; i < 10; i++){
            if (!Character.isDigit(isbn.charAt(i))) {
                if (i == 9 && isbn.charAt(i) == 'X'){
                    total += 10;
                    break;
                }
                else {
                    throw new NumberFormatException("An ISBN should contain digits only");
                }
            }

            total += isbn.charAt(i) * (10-i);
        }

        return (total % 11 == 0);
    }
}