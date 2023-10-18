package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class DesafioFilter {

    public static void main(String[] args) {

        Album alb1 = new Album("darkside", "rock", 10.0);
        Album alb2 = new Album("black planet", "rock", 8.2);
        Album alb3 = new Album("bait", "pop", 7.3);
        Album alb4 = new Album("await", "metal", 9.2);
        Album alb5 = new Album("faces", "folk", 8.0);
        Album alb6 = new Album("no.33", "rock", 6.1);

        List<Album> albums = Arrays.asList(alb1,alb2,alb3,alb4,alb5,alb6);

        albums
                .stream()
                .filter(a -> a.estilo.equals("rock"))
                .filter(a -> a.nota >= 7)
                .map(a -> "Discos recomendados: " + a.nome)
                .forEach(System.out::println);

    }

}
