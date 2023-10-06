package OrientacaoObjetos.Polimorfismo;

public class Jantar {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(70);
        Comida pizza = new Pizza(1.5);
        Comida bife = new Bife(2.5);

        System.out.println(pessoa.getPeso());

        pessoa.comer(pizza);
        System.out.println(pessoa.getPeso());

        pessoa.comer(bife);
        System.out.println(pessoa.getPeso());

    }
}
