package Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// recebe um parâmetro e não retornar nada
public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimir = p -> System.out.println(p.nome);
        Produto p1 = new Produto("testt1", 12.15, 0.09);
        Produto p2 = new Produto("testt2", 12.15, 0.09);
        Produto p3 = new Produto("testt3", 12.15, 0.09);
        Produto p4 = new Produto("testt4", 12.15, 0.09);
        List<Produto> produtoList = Arrays.asList(p1,p2,p3,p4);
        imprimir.accept(p1);
        produtoList.forEach(imprimir);
    }
}
