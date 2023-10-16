package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        Stream<String> langs = Stream.of("test1", "test2", "test3");
        langs.forEach(print);

        String[] test = {"test4", "tes5", "test6"};
        Stream.of(test).forEach(print);

        List<String> test2 = Arrays.asList("test7", "test8", "test9");
        test2.stream().forEach(print);

    }

}
