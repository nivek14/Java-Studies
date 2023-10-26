package Swing;

import javax.swing.*;
import java.awt.*;

public class Observador {

    public static void main(String[] args) {

        JFrame janela = new JFrame("Observador");

        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // indica que se a janela for fechada o app deve parar
        janela.setSize(600, 200); // tamanho da janela
        janela.setLayout(new FlowLayout()); // seta um layout para a janela
        janela.setLocationRelativeTo(null); // centraliza janela no meio da tela

        JButton botao = new JButton("clicar"); // cria um botao
        janela.add(botao); // adiciona o botao na janela

        botao.addActionListener(e -> {
            System.out.println("ok");
        }); // dispara uma ação ao ser clicado

        janela.setVisible(true); // mostra a janela

    }

}
