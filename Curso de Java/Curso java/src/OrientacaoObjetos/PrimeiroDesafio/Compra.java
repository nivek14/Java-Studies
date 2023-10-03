package OrientacaoObjetos.PrimeiroDesafio;

import java.util.ArrayList;

public class Compra {

    final ArrayList<Item> items = new ArrayList<Item>();

    void adicionarItem(Produto p, int qtd){
        this.items.add(new Item(p,qtd));
    }

    double valorTotal(){
        double valorTotal = 0;
        for (Item i: items) {
            valorTotal += i.produto.preco * i.quantidade;
        }
        return valorTotal;
    }

}
