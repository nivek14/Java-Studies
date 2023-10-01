package ArraysCollections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    public static void main(String[] args) {

        // conjunto heterogeneo
        HashSet conjunto = new HashSet<>();
        conjunto.add(1);
        conjunto.add(true);
        conjunto.add("teste");

        // conjunto homogeneo
        Set conjunto2 = new HashSet();
        conjunto2.add(1);
        conjunto2.add(2);
        conjunto2.add(3);

        // algumas funções do set
        System.out.println(conjunto.contains(1.2));
        System.out.println(conjunto.size());

        // união de conjuntos
        conjunto.addAll(conjunto2);
        System.out.println(conjunto);

        // intersecção de conjuntos
        conjunto.retainAll(conjunto2);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);

        // o treeset garante a ordenação
        Set<String> stringSet = new TreeSet<>();
        stringSet.add("teste1");
        stringSet.add("teste2");

        for (String s: stringSet) {
            System.out.println(stringSet);
        }

    }
}
