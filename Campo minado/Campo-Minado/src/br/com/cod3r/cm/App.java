package br.com.cod3r.cm;

import br.com.cod3r.cm.module.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroConsole;
import javafx.scene.control.Tab;

public class App {

    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6,6,6);
        new TabuleiroConsole(tabuleiro);
    }

}
