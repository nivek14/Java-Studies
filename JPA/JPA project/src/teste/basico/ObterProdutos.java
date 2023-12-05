package teste.basico;

import infra.ProdutoDAO;
import modelo.basico.Produto;

public class ObterProdutos {

    public static void main(String[] args) {

        ProdutoDAO dao = new ProdutoDAO();
        List<Produto> produtos = dao.obterTodos();

        for(Produto produto: produtos){
            System.out.println("ID: " + produto.getId() + ", Nome: " + produto.getNome());
        }

    }

}
