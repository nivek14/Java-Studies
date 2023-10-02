package Codes;

import java.util.Scanner;

public class Bee1008 {

    public static void main(String[] args) {

        int number,wh;
        double whr, salary;
        Scanner scanner = new Scanner(System.in);

        number = scanner.nextInt();
        wh = scanner.nextInt();
        whr = scanner.nextDouble();

        salary = wh * whr;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);

    }
}
