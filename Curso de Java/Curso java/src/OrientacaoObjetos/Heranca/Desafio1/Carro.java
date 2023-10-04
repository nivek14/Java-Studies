package OrientacaoObjetos.Heranca.Desafio1;

public class Carro {

    double velocidadeAtual;

    void acelerar(){
        velocidadeAtual += 5;
    }

    void frear(){
        if(velocidadeAtual != 0) velocidadeAtual -= 5;
        else System.out.println("carro já esta parado");
    }
}
