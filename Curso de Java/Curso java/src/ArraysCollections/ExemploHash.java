package ArraysCollections;

import ClassesMetodos.User;

import java.util.HashSet;

public class ExemploHash {
    public static void main(String[] args) {

        HashSet<User> users = new HashSet<User>();

        users.add(new User("test1"));
        users.add(new User("test2"));
        users.add(new User("test3"));

        System.out.println(users.contains(new User("test4")));

    }
}
