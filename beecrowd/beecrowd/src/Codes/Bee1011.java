package Codes;

import java.util.Scanner;

public class Bee1011 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double radius, calc;
        final double  PI = 3.14159;

        radius = scanner.nextDouble();

        calc = (4 / 3.0) * PI * Math.pow(radius, 3);

        System.out.printf("VOLUME = %.3f\n", calc);

    }
}
