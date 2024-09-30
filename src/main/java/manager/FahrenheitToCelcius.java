package manager;

public class FahrenheitToCelcius implements Converter {
    @Override
    public double convert(double value) {
        double result = (value - 32) * 5 / 9;
        System.out.printf("%.1ºC", result);
        return result;
    }
}
