package generics;

public class CaixaNumeroTest {

    public static void main(String[] args) {

        CaixaNumero<Integer> caixaA = new CaixaNumero<>();
        caixaA.aguardar(1);
        System.out.println(caixaA.abrir());

    }

}
