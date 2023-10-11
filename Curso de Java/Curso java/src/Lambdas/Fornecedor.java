package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// não recebe parâmetro mas retorna algo
public class Fornecedor {
    public static void main(String[] args) {
        Supplier<List<String>> umaLista = () -> Arrays.asList("a", "b", "c");
        System.out.println(umaLista.get());
    }
}
