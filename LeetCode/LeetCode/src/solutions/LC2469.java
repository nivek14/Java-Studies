package solutions;

public class LC2469 {

    public double[] convertTemperature(double celsius) {

        double[] convertedTemperatures = new double[2];

        convertedTemperatures[0] = celsius + 273.15;
        convertedTemperatures[1] = celsius * 1.80 + 32.00;

        return convertedTemperatures;

    }

}
