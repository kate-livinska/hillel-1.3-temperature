package manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FahrenheitToCelciusTest {
    private Converter fahrenheitToCelcius;

    @Test
    void convertFahrenheitToCelciusTest() {
        fahrenheitToCelcius = new FahrenheitToCelcius();

        int testInput = 200;
        double expectedOutput = ((double) testInput - 32) * 5 / 9;
        double actualOutput = fahrenheitToCelcius.convert(testInput);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}