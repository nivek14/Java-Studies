package OrientacaoObjetos.Heranca.Desafio1;

public class Ford extends Carro{

    Ford(){
        super(150);
    }

    @Override
    void acelerar() {
        velocidadeAtual += 10;
    }

    @Override
    void frear() {
        if(velocidadeAtual != 0) velocidadeAtual -= 10;
        else System.out.println("carro já esta parado");
    }

}
