package Codes;

import java.util.Scanner;

public class Bee1015 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double x1,y1,x2,y2, dist;

        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        dist = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));

        System.out.printf("%.4f\n", dist);

    }
}
