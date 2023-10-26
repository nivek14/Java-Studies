package Padroes.obsever;

public class Namorada implements ObservadorChegadaAniversariante{

    @Override
    public void chegou(EventAniversariante evento) {
        System.out.println("avisar...");
        System.out.println("esperar...");
        System.out.println("helloo");
    }

}
