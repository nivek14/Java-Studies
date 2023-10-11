package Lambdas;

import java.util.function.Function;

// recebe uma entrada e retorna uma saida
public class Funcao {
    public static void main(String[] args) {
        Function<Integer, String> parOuImpar = n -> n % 2 == 0 ? "Par": "Impar";
        Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
        System.out.println(parOuImpar.andThen(oResultadoE).apply(32));
    }
}
