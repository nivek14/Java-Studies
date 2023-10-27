package br.com.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {

    public Botao(String label, Color cor){
        setText(label);
        setOpaque(true);
        setBackground(cor);
        setFont(new Font("courier", Font.PLAIN, 25));
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

}
