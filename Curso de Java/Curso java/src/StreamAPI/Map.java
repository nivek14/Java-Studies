package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> test = Arrays.asList("test1", "test2", "test3");

        test.stream().map(m -> m.toUpperCase()).forEach(print);

        UnaryOperator<String> uper = n -> n.toUpperCase();
        UnaryOperator<String> letra = n -> n.charAt(0) + "";

        test.stream().map(uper).map(letra).forEach(print);


    }

}
