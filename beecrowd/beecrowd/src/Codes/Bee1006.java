package Codes;

import java.util.Scanner;

public class Bee1006 {

    public static void main(String[] args) {

        double a,b,c,m;
        double w1 = 2 ,w2 = 3, w3 = 5;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        m = ((w1 * a) + (w2 * b) + (w3 * c)) / (w1 + w2 + w3);

        System.out.printf("MEDIA = %.1f\n", m);

        scanner.close();
    }

}
