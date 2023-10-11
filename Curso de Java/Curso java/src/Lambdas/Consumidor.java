package Lambdas;

import java.util.function.Consumer;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<String> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("testt", 12.15, 0.09);
        imprimir.accept(p1.toString());
    }
}
