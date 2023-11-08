package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        // criando o entity manager para manipular o jpa
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA project");
        EntityManager em = emf.createEntityManager();

        Usuario usuario = new Usuario("test", "test@test.com");

        // inserindo os usuarios no banco
        em.getTransaction().begin();
        em.persist(usuario);
        em.getTransaction().commit();

        em.close();
        emf.close();

    }

}
