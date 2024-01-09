package com.example.demo.controllers;

import com.example.demo.model.entities.Produto;
import com.example.demo.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired // o spring cria automaticamente um objeto do tipo produtorepository
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(Produto produto){
        produtoRepository.save(produto);
        return produto;
    }


}
