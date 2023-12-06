package teste.basico.umpramuitos;

import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedidos;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedidos.class);
        Pedidos pedidos = dao.obterPorID(1l);
        for(ItemPedido item: pedidos.getItens()){
            System.out.println(item.getQuantidade());
        }

        dao.fechar();

    }
}
