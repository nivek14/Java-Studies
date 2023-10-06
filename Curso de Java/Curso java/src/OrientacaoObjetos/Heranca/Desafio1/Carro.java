package OrientacaoObjetos.Heranca.Desafio1;

public class Carro {

    final int VELOCIDADE_MAXIMA;
    double velocidadeAtual;
    double delta = 5;


    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }


    void acelerar(){
        if(velocidadeAtual + 5 > VELOCIDADE_MAXIMA){
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else{
            velocidadeAtual += delta;
        }
    }

    void frear(){
        if(velocidadeAtual != 0) velocidadeAtual -= 5;
        else System.out.println("carro já esta parado");
    }
}
