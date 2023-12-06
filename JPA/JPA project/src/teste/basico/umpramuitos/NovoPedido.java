package teste.basico.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedidos;

public class NovoPedido {

    public static void main(String[] args) {
        DAO<Object> dao = new DAO<>();
        Produto produto = new Produto("Geladeira", 200.00);
        Pedidos pedido = new Pedidos();
        ItemPedido item = new ItemPedido(pedido, produto, 10);

        dao.abrirT().incluir(produto).incluir(pedido).incluir(item).fecharT().fechar();
    }

}
