package OrientacaoObjetos;

import OrientacaoObjetos.InterfaceExemplo;

public class ImplementadoInterface implements InterfaceExemplo {

    @Override
    public void ligar() {
        System.out.println("ligado");
    }

    @Override
    public void desligar() {
        System.out.println("desligado");
    }
}
