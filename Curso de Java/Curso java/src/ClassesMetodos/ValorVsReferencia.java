package ClassesMetodos;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; // atribuição por valor
        a++;
        b--;

        System.out.println(a + " " + b);

        Data d1 = new Data("1", "06", "2022");
        Data d2 = d1; // atribuição por referência, mesma área de memória (mesmo objeto em memória)

        d1.dia = "02";
        d2.mes = "11";

        System.out.println(d1.FormatarData());
        System.out.println(d2.FormatarData());

    }
}
