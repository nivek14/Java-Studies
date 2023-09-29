package EstruturasDeControle;

import java.util.Scanner;

public class DesafioDiaDaSemana {

    public static String dia;
    public static Scanner scanner;

    public static void main(String[] args) {
        GetDay();
        ShowDayNumber();
    }

    public static void GetDay(){
        scanner = new Scanner(System.in);
        dia = scanner.next();
    }

    public static void ShowDayNumber(){
        if (dia.equalsIgnoreCase("segunda")) System.out.println("1");
        else if (dia.equalsIgnoreCase("terça")) System.out.println("2");
        else if (dia.equalsIgnoreCase("quarta")) System.out.println("3");
        else if (dia.equalsIgnoreCase("quinta")) System.out.println("4");
        else if (dia.equalsIgnoreCase("sexta")) System.out.println("5");
        else if (dia.equalsIgnoreCase("sábado")) System.out.println("6");
        else if (dia.equalsIgnoreCase("domingo")) System.out.println("7");
        else System.out.println("não identificado");
        scanner.close();
    }

}
