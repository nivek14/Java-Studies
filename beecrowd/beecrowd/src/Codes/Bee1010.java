package Codes;

import java.util.Scanner;

public class Bee1010 {

    public static void main(String[] args) {

        int code,nu;
        double price, calc = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i=0;i<2;i++){
            code = scanner.nextInt();
            nu = scanner.nextInt();
            price = scanner.nextDouble();
            calc += nu * price;
        }

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", calc);

    }
}
