package teste.basico;

import modelo.basico.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA project");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    // objeto gerenciado (o jpa sempre irá sincronizar com banco de dados)
    Usuario usuario = em.find(Usuario.class, 7L);
    usuario.setNome("teste");
    usuario.setEmail("teste@teste.com");

    em.merge(usuario);

    em.getTransaction().commit();

    em.close();
    emf.close();


}
