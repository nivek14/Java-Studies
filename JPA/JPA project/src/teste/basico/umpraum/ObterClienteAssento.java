package teste.basico.umpraum;

import infra.DAO;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        Cliente cliente = dao.obterPorID(1l);

        dao.fechar();

    }
}
