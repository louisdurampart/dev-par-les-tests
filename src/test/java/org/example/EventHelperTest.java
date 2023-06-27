package org.example;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenHelperTest {

    @Test
    void checkIsEven() {
        int[] numbers = {1, 2, 3, 4, 5, 23, 70, 89, 240};
        EvenHelper evenHelper = new EvenHelper();

        for (int n : numbers) {
            boolean expectedResult = n % 2 == 1;
            assertEquals(expectedResult, evenHelper.isEven(n));
        }
    }
}