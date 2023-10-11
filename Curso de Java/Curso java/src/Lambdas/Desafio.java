package Lambdas;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("test", 3235.89, 0.13);

        Function<Produto, Double> valorComDesconto = prod -> (prod.preco * (1 - prod.desconto));
        UnaryOperator<Double> impostoMunicipal = n -> n >= 2500 ? n * 1.085 : n;
        UnaryOperator<Double> frete = n -> n >= 3000 ? n + 100 : n + 50;
        Function<Double, String> arredondar = n -> new DecimalFormat("#.00").format(n);
        UnaryOperator<String> formatar = n -> "R$" + n;

        System.out.println(valorComDesconto.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p));

    }
}
