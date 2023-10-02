package Codes;

import java.util.Scanner;

public class Bee1005 {

    public static void main(String[] args) {

        double a,b,m;
        double w1 = 3.5 ,w2 = 7.5;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextDouble();
        b = scanner.nextDouble();

        m = ((w1 * a) + (w2 * b)) / (w1 + w2);

        System.out.printf("MEDIA = %.5f\n", m);

        scanner.close();
    }
}
