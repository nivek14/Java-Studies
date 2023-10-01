package ClassesMetodos;

public class EqualsHashcode {
    public static void main(String[] args) {

        User u = new User();
        u.nome = "alguem";
        u.email = "a@a";

        User u2 = new User();
        u2.nome = "alguem";
        u2.email = "a@a";

        System.out.println(u.equals(u2));
    }
}
