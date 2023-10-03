package Codes;

import java.util.Scanner;

public class Bee1014 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x;
        double y,calc;

        x = scanner.nextInt();
        y = scanner.nextDouble();

        calc = x / y;

        System.out.printf("%.3f km/l\n", calc);

    }
}
