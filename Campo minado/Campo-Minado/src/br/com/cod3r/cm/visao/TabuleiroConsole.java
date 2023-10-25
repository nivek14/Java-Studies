package br.com.cod3r.cm.visao;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.Sair;
import br.com.cod3r.cm.module.Tabuleiro;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class TabuleiroConsole {

    private Tabuleiro tabuleiro;
    private Scanner scanner = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;
        executarJogo();
    }

    private void executarJogo() {
        try {

            boolean continuar = true;

            while (continuar){

                cicloDoJogo();

                System.out.println("Outra partida? (S/N)");

                String reposta = scanner.nextLine();

                if ("n".equalsIgnoreCase(reposta)){
                    continuar = false;
                }
                else{
                    tabuleiro.reiniciar();
                }
            }
        }catch (Sair e){
            System.out.println("final do jogo");
        }finally {
            scanner.close();
        }
    }

    private void cicloDoJogo() {
        try{
            while(!tabuleiro.objetivoAlcancado()){
                System.out.println(tabuleiro);
                String digitado = capturarValorDigitado("digite x e y: ");
                Iterator<Integer> xy = Arrays.stream(digitado.split(","))
                        .map(e -> Integer.parseInt(e.trim()))
                        .iterator();
                System.out.println("1 - abrir ou 2 - marcar/desmarcar");

                if ("1".equals(digitado)){
                    tabuleiro.abrir(xy.next(), xy.next());
                }
                else if("2".equals(digitado)){
                    tabuleiro.alterarMarcacao(xy.next(), xy.next());
                }
            }
            System.out.println("ganhou");
        }catch (ExplosaoException e){
            System.out.println(tabuleiro);
            System.out.println("perdeu");
        }
    }

    private String capturarValorDigitado(String texto) {
        System.out.print(texto);
        String digitado = scanner.nextLine();
        if("sair".equalsIgnoreCase(digitado)){
            throw new Sair();
        }
        return digitado;
    }

}
