package ArraysCollections;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<String>();

        fila.add("teste1");
        fila.offer("teste2");

        // peek e element irão obter o próximo elemento da fila, difença quando a fila está vazia
        System.out.println(fila.peek());    // retorna null
        System.out.println(fila.element()); // lança uma exceção

        // poll e remove irão obter o próximo elemento da fila e remover
        System.out.println(fila.poll());    // retorna null
        System.out.println(fila.remove());  // lança uma exceção

    }
}
