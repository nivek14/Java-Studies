package Fundamentos;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String sal1 = scanner.next().replace(',','.');;
        String sal2 = scanner.next().replace(',','.');;
        String sal3 = scanner.next().replace(',','.');;

        double med = (Double.parseDouble(sal1) + Double.parseDouble(sal2) + Double.parseDouble(sal3)) / 3;

        System.out.println(med);

        scanner.close();

    }

}
