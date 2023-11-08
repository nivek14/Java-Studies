package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {

    public static void main(String[] args) {

        // criando o entity manager para manipular o jpa
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA project");
        EntityManager em = emf.createEntityManager();

        // vai pegar um user do banco
        Usuario usuario = em.find(Usuario.class, 1L);

        em.close();
        emf.close();

    }
}
