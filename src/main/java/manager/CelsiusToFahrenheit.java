package manager;

public class CelsiusToFahrenheit implements Converter {
    @Override
    public double convert(int value) {
        double result = ((double) value * 9/5) + 32;
        System.out.printf("%.1℉", result);
        return result;
    }
}
