package ArraysCollections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExemploPilha {
    public static void main(String[] args) {

        Deque<String> pilha = new ArrayDeque<String>();

        pilha.add("teste1");
        pilha.push("teste2");

        System.out.println(pilha.peek());
        System.out.println(pilha.element());
        System.out.println(pilha.pop());
        System.out.println(pilha.poll());

    }
}
