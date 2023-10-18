package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("test1", 7.1);
        Aluno a2 = new Aluno("test2", 8.1);
        Aluno a3 = new Aluno("test3", 9.1);
        Aluno a4 = new Aluno("test4", 10.0);
        Aluno a5 = new Aluno("test1", 7.1);
        Aluno a6 = new Aluno("test2", 8.1);
        Aluno a7 = new Aluno("test3", 9.1);
        Aluno a8 = new Aluno("test4", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        alunos.stream().distinct().skip(1).limit(2).forEach(System.out::println);

    }

}
