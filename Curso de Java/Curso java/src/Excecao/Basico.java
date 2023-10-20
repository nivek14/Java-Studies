package Excecao;

import StreamAPI.Aluno;

public class Basico {

    public static void main(String[] args) {

        Aluno a1 = null;

        try{
            imprimirAluno(a1);
        }catch(Exception e){
         System.out.println("erro com aluno");
        }

        try{
            System.out.println(7 / 0);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }


    }

    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }

}
