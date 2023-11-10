package teste.basico;

import modelo.basico.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA project");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        // objeto não gerenciado (usando detach)
        Usuario usuario = em.find(Usuario.class, 7L);
        em.detach(usuario);
        usuario.setNome("teste");
        usuario.setEmail("teste@teste.com");

        em.merge(usuario);

        em.getTransaction().commit();

        em.close();
        emf.close();

    }

}
