package Lambdas;

import java.util.function.Predicate;

// recebe um parâmetro e retorna um booleano
public class Predicado {

    public static void main(String[] args) {
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
        Produto produto = new Produto("teste", 3000.00, 0.15);
        System.out.println(isCaro.test(produto));
    }

}
