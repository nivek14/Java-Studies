package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.module.Tabuleiro;
import javafx.scene.control.Tab;

import javax.swing.*;
import java.awt.*;

public class PainelTabuleiro extends JPanel {

    public PainelTabuleiro(Tabuleiro tabuleiro){

        setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));

        tabuleiro.paraCada(c -> add(new BotaoCampo(c)));

        tabuleiro.registrarObservador(e -> {

        });

    }

}
