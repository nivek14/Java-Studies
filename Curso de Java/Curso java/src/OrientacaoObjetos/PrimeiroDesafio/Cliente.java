package OrientacaoObjetos.PrimeiroDesafio;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> compras = new ArrayList<Compra>();

    Cliente(String nome){
        this.nome = nome;
    }

    double obterValorTotal(){
        double valorTotal = 0;
        for (Compra c: compras) {
            valorTotal += c.valorTotal();
        }
        return valorTotal;
    }

}
