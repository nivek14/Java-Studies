package ArraysCollections;

import ClassesMetodos.User;

import java.util.ArrayList;

public class ExemploLista {
    public static void main(String[] args) {

        ArrayList<User> userList = new ArrayList<>();
        userList.add(new User("teste"));
        userList.add(new User("teste2"));

        System.out.println(userList.get(1).nome);

        for (User u: userList) {
            System.out.println(u.nome);
        }

    }
}
