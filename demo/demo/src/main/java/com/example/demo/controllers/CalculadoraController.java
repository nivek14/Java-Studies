package com.example.demo.controllers;

import com.example.demo.models.Calculadora;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

    @GetMapping("/{a}/{b}")
    // na url fica: http://localhost:8080/calculadora/10/5
    public int soma(@PathVariable int a, @PathVariable int b){
        Calculadora calc = new Calculadora(a, b);
        return calc.getA() + calc.getB();
    }

    @GetMapping(path = "subtrair")
    // na url fica: http://localhost:8080/calculadora/subtrair?a=10&b=5
    public int subtrair(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b){
        Calculadora calc = new Calculadora(a, b);
        return calc.getA() - calc.getB();
    }

}
