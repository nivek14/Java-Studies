package StreamAPI;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FuncoesMap {

    private FuncoesMap(){}

    public final static Function<Integer, String> binario   = n -> Integer.toBinaryString(n);
    public final static UnaryOperator<String> inverte       = n -> new StringBuilder(n).reverse().toString();
    public final static Function<String, Integer> inteiro   = n -> Integer.parseInt(n,2);

}
