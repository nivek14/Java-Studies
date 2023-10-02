package Codes;

import java.util.Scanner;

public class Bee1009 {

    public static void main(String[] args) {

        String name;
        double salary,tvs,total;
        Scanner scanner = new Scanner(System.in);

        name = scanner.next();
        salary = scanner.nextDouble();
        tvs = scanner.nextDouble();

        total = salary + (tvs * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", total);

    }

}
