package Codes;

import java.util.Scanner;

public class Bee1017 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b;
        double result;

        a = scanner.nextInt();
        b = scanner.nextInt();

        result = (a * b) / 12f;

        System.out.printf("%.3f\n", result);

    }
}
