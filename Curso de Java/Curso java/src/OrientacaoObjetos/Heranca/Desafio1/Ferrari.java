package OrientacaoObjetos.Heranca.Desafio1;

public class Ferrari extends Carro{

    @Override
    void acelerar() {
        velocidadeAtual += 15;
    }

    @Override
    void frear() {
        if(velocidadeAtual != 0) velocidadeAtual -= 15;
        else System.out.println("carro já esta parado");
    }
}
