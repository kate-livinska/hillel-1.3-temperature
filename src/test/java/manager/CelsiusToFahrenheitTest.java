package manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CelsiusToFahrenheitTest {
    private Converter celsiusToFahrenheit;

    @Test
    void convertCelsiusToFahrenheitTest() {
        celsiusToFahrenheit = new CelsiusToFahrenheit();

        int testInput = 27;
        double expectedOutput = ((double) testInput * 9/5) + 32;
        double actualOutput = celsiusToFahrenheit.convert(testInput);

        Assertions.assertEquals(expectedOutput, actualOutput);
    }
}