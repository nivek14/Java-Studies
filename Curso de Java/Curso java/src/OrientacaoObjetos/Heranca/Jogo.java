package OrientacaoObjetos.Heranca;

public class Jogo {

    public static void main(String[] args) {

        Jogador j1 = new Jogador();

        j1.andar(Direcao.NORTE);

        System.out.println(j1.y);

    }

}
