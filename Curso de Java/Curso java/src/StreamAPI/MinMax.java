package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("test1", 7.1);
        Aluno a2 = new Aluno("test2", 8.1);
        Aluno a3 = new Aluno("test3", 9.1);
        Aluno a4 = new Aluno("test4", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> notas = (aluno1,aluno2) -> {
          if(aluno1.nota > aluno2.nota) return 1;
          if(aluno1.nota < aluno2.nota) return -1;
          return 0;
        };

        System.out.println(alunos.stream().max(notas).get());
        System.out.println(alunos.stream().min(notas).get());

    }
}
