package br.com.calc.visao;

import javax.swing.*;
import java.awt.*;

public class Display extends JPanel {

    private final JLabel label;

    public Display(){

        setBackground(new Color(46,49,50));                          // cor de background do display
        label = new JLabel("1234,56");                                  // os números que serão apresentados no display
        label.setForeground(Color.white);                                   // a cor da fonte dos números
        label.setFont(new Font("courier", Font.PLAIN, 30));      // configurações da fonte
        setLayout(new FlowLayout(FlowLayout.RIGHT,10,25));      // posição que os números serão apresentados
        add(label);

    }

}
