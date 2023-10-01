package ClassesMetodos;

public class ProdutoTeste {
    public static void main(String[] args) {

        Produto produto = new Produto("tagima t635", 1500);

        System.out.println(produto.nome);
        System.out.println(produto.preco);
        System.out.println(produto.desconto);
        System.out.println(produto.DescontoProduto());

    }
}
