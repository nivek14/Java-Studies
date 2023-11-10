package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Persistence.TypedQuery;

public class ObterUsuarios {

    public static void main(String[] args) {

        // criando o entity manager para manipular o jpa
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA project");
        EntityManager em = emf.createEntityManager();

        // criando uma query para obter usuários
        String jpql = "select u from Usuario u";
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);

        // limitando para trazer apenas 5 resultados
        query.setMaxResults(5);

        // colocando os dados dentro de uma lista
        List<Usuario> usuarioList = query.getResultList();

        em.close();
        emf.close();

    }

}
