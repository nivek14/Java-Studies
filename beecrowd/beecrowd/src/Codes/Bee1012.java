package Codes;

import java.util.Scanner;

public class Bee1012 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double a,b,c;
        double arect, aradius, atrap, asquare, arect2;
        final double PI =  3.14159;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        arect = (1/2.0) * a * c;
        aradius = PI * Math.pow(c,2);
        atrap = (1/2.0) * ((a + b) * c);
        asquare = b * b;
        arect2 = a * b;

        System.out.printf("TRIANGULO: %.3f\n", arect);
        System.out.printf("CIRCULO: %.3f\n", aradius);
        System.out.printf("TRAPEZIO: %.3f\n", atrap);
        System.out.printf("QUADRADO: %.3f\n", asquare);
        System.out.printf("RETANGULO: %.3f\n", arect2);
    }

}
