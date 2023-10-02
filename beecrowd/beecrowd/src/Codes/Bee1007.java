package Codes;

import java.util.Scanner;

public class Bee1007 {

    public static void main(String[] args) {

        int a,b,c,d,calc;
        Scanner scanner = new Scanner(System.in);

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();

        calc = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + calc);

    }
}
