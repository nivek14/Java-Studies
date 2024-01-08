package com.example.demo.controllers;

import com.example.demo.models.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping("/{a}/{b}")
    public int soma(@PathVariable int a, @PathVariable int b){
        Calculadora calc = new Calculadora(a, b);
        return calc.getA() + calc.getB();
    }

    @GetMapping
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        Calculadora calc = new Calculadora(a, b);
        return calc.getA() - calc.getB();
    }

}
