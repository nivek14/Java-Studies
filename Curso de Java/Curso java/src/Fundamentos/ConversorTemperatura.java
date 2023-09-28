package Fundamentos;

import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * (5/9.0);

        System.out.println(celsius);
    }
}
