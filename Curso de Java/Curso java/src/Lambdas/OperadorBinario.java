package Lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {

    public static void main(String[] args) {

        BinaryOperator<Double> media = (n1,n2) -> (n1 + n2) / 2;
        System.out.println(media.apply(8.5,7.3));

        BiFunction<Double, Double, String> resultado = (n1,n2) -> ((n1 + n2) / 2) >= 7 ? "aprovado" : "reprovado";
        System.out.println(resultado.apply(8.5,7.3));
    }
}
