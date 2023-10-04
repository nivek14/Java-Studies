package OrientacaoObjetos.Heranca.Desafio1;

public class Teste {

    public static void main(String[] args) {

        Carro carro1 = new Ferrari();
        Carro carro2 = new Ford();

        carro1.acelerar();
        carro2.acelerar();

        System.out.println(carro1.velocidadeAtual);
        System.out.println(carro2.velocidadeAtual);

        carro1.frear();
        carro2.frear();

        System.out.println(carro1.velocidadeAtual);
        System.out.println(carro2.velocidadeAtual);


    }

}
