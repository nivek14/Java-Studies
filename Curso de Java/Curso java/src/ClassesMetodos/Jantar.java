package ClassesMetodos;

public class Jantar {
    public static void main(String[] args) {

        Comida c1 = new Comida(3.0, "bife de carne");
        Comida c2 = new Comida(2.0, "mega pizza");
        Pessoa p = new Pessoa(75, "alguem");

        p.PesoAtual();
        p.Comer(c1);

        p.PesoAtual();
        p.Comer(c2);

        p.PesoAtual();

    }
}
