package com.example.demo.model.repositories;

import com.example.demo.model.entities.Produto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

    // a interface faz a persistência e o spring fornece a implementação do crud

    // definição de uma função que o spring vai criar a partir de uma convenção (ex: findByAlgoContainingIgnoreCase)
    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

}
