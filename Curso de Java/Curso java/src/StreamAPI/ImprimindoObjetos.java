package StreamAPI;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("test", "test2", "test3");

        // usando o foreach
        for(String nome: aprovados){
            System.out.println(nome);
        }

        // usando iterator
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        // usando stream
        Stream<String> st = aprovados.stream();
        st.forEach(System.out::println);

    }

}
