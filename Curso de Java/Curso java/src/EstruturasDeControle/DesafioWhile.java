package EstruturasDeControle;

import javax.jnlp.SingleInstanceListener;
import java.util.Scanner;

public class DesafioWhile {

    public static double notas, media, nota;
    public static int total;
    public static Scanner scanner;

    public static void main(String[] args) {
        Init();
        GetNotas();
    }

    public static void Init(){
        scanner = new Scanner(System.in);
        nota = 0;
        notas = 0;
        media = 0;
        total = 0;
    }

    public static void GetNotas(){
        while(nota != -1){
            nota = scanner.nextDouble();
            if (nota >= 0 && nota <= 10){
                notas += nota;
                total++;
            }
            else if (nota != -1) System.out.println("digite uma nota válida");
        }
        CalculoFinal();
    }

    public static void CalculoFinal(){
        media = notas / total;
        System.out.println("sua media: " + media);
        scanner.close();
    }

}
