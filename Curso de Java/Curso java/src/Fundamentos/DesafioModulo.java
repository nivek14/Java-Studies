package Fundamentos;

import java.util.Scanner;

public class DesafioModulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String o = scanner.next();

        double calc = o.equals("+") ? x + y : o.equals("-") ? x - y : o.equals("*") ? x * y : o.equals("/") ? x / y : 0;

        System.out.println(calc);
        scanner.close();

    }
}
