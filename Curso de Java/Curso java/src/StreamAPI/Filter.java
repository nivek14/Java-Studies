package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Filter {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("test1", 7.8);
        Aluno a2 = new Aluno("test2", 6.2);
        Aluno a3 = new Aluno("test3", 5.0);
        Aluno a4 = new Aluno("test4", 9.2);
        Aluno a5 = new Aluno("test5", 8.3);

        List<Aluno> alunos = Arrays.asList(a1,a2,a3,a4,a5);

        alunos.stream().filter(a -> a.nota >= 7).map(a -> "aprovado " + a.nome).forEach(System.out::println);

    }

}
