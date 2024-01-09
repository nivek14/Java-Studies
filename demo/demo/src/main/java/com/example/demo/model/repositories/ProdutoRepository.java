package com.example.demo.model.repositories;

import com.example.demo.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

    // a interface faz a persistência e o spring fornece a implementação do crud

}
