package generics;

import java.util.List;

public class ListaUtil {

    // sem usar generics
    public static Object getUltimo1(List<?> lista){
        return lista.get(lista.size() - 1);
    }

    // usando o generics
    public static <G> G getUltimo2(List<G> lista){
        return lista.get(lista.size() - 1);
    }

}
