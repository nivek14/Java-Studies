package Codes;

import java.util.Scanner;

public class Bee1013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a,b,c,MaiorAB,r;

        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        MaiorAB = (a + b + Math.abs(a - b)) / 2;

        if(MaiorAB > c) r = MaiorAB;
        else r = c;

        System.out.println(r + " eh o maior");

    }
}
