package solutions.Java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LC1436 {

    public String destCity(List<List<String>> paths) {

        String destination = null;
        HashMap<String, String> cities = new HashMap<String, String>();

        // passando valores da lista para um hashmap
        for(int i = 0; i < paths.size(); i++){
            int j = 0;
            cities.put(paths.get(i).get(j), paths.get(i).get(j + 1));
        }

        // pegando as chaves e valores do hashmap
        List<String> keys = new ArrayList<>(cities.keySet());
        List<String> values = new ArrayList<>(cities.values());

        // verificando se temos o valor no array de chaves
        for(int i = 0; i < values.size(); i++){
            if(keys.contains(values.get(i)));
            else destination = values.get(i);
        }

        return destination;

    }

}
