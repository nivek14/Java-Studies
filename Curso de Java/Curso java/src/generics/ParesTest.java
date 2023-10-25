package generics;

public class ParesTest {

    public static void main(String[] args) {

        Pares<Integer, String> test = new Pares<>();
        test.adicionar(1, "test1");
        test.adicionar(2, "test2");
        test.adicionar(3, "test3");
        test.adicionar(4, "test4");

        System.out.println(test.getValor(1));

    }
}
