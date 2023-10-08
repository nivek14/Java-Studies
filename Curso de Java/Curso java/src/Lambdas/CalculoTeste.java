package Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste {
    public static void main(String[] args) {
        BinaryOperator<Double> soma = (a, b) -> {return a + b;};
        Calculo Mult = (a, b) -> a * b;
        System.out.println(soma.apply(1.0,1.0));
        System.out.println(Mult.executar(2,8));
    }
}
