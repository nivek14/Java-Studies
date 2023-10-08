package Lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("one", "two", "three");

        // usando lambda
        aprovados.forEach((nome) -> {System.out.println("aprovado" + nome);});
        aprovados.forEach(nome -> meuImprimir(nome));

        // usando method reference: menos flexível pois não permite personalização
        aprovados.forEach(System.out::println);
        aprovados.forEach(Foreach::meuImprimir);
    }

    static void meuImprimir(String nome){
        System.out.println("nome é " + nome);
    }

}
