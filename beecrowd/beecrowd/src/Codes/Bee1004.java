package Codes;

import java.util.Scanner;

public class Bee1004 {

    public static void main(String[] args) {

        int a,b;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();

        System.out.println("PROD = " + (a * b));

        scanner.close();

    }
}
