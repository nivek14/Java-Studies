package ArraysCollections;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "test");
        usuarios.put(2, "test2");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());

        System.out.println(usuarios.containsKey(20));
        System.out.println(usuarios.containsValue("test"));

        System.out.println(usuarios.get(2));

        for (Map.Entry<Integer, String> u: usuarios.entrySet()){
            System.out.println(u.getKey());
        }

    }
}
