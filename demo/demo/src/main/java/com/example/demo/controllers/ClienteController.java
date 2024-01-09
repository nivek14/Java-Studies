package com.example.demo.controllers;

import com.example.demo.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {

    @GetMapping(path = "qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "test", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id){
        return new Cliente(id, "test", "987.654.321-00");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id") int id){
        return new Cliente(id, "test2", "111.222.333-00");
    }

}
