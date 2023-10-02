package Codes;

import java.util.Scanner;

public class Bee1002 {

    public static void main(String[] args) {

        double r;
        final double N = 3.14159d;
        Scanner scanner = new Scanner(System.in);

        r = scanner.nextDouble();

        System.out.printf("A=%.4f\n", N * Math.pow(r, 2));

        scanner.close();

    }

}
