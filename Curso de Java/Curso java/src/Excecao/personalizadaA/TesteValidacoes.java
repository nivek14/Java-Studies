package Excecao.personalizadaA;

import StreamAPI.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try{
            Aluno aluno = new Aluno("", -7);
            Validar.aluno(aluno);
        }catch (StringVaziaException e){
            System.out.println(e.getMessage());
        }catch (NumeroNegativoException e){
            System.out.println(e.getMessage());
        }


    }

}
