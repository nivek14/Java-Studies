package br.com.cod3r.cm.module;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Tabuleiro implements CampoObservador{

    private int linhas;
    private int colunas;
    private int minas;

    private List<Campo> campos = new ArrayList<>();
    private List<Consumer<Boolean>> observadores = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
        gerarCampos();
        associarVizinhos();
        sortearMinas();
    }

    public void registrarObservador(Consumer<Boolean> observador){
        observadores.add(observador);
    }

    public void notificarObservadores(boolean resultado){
        observadores.stream().forEach(o -> o.accept(resultado));
    }

    public void abrir(int linha, int coluna){
        try{
            campos.parallelStream()
                    .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                    .findFirst()
                    .ifPresent(c -> c.abrir());
        }catch (Exception e){
            campos.forEach(c -> c.setAberto(true));
            throw e;
        }
    }

    private void mostrarMinas(){
        campos.stream().filter(c -> c.isMinado()).forEach(c -> c.setAberto(true));
    }

    public void alterarMarcacao(int linha, int coluna){
        campos.parallelStream()
                .filter(c -> c.getLinha() == linha && c.getColuna() == coluna)
                .findFirst()
                .ifPresent(c -> c.alterarMarcacao());
    }

    private void gerarCampos() {
        for(int i = 0;i < linhas; i++){
            for(int j = 0;j < colunas; j++){
                Campo campo = new Campo(i,j);
                campo.registrarObservador(this);
                campos.add(campo);
            }
        }
    }

    private void associarVizinhos() {
        for(Campo c1: campos){
            for(Campo c2: campos){
                c1.adicionarVizinho(c2);
            }
        }
    }

    private void sortearMinas() {

        long minasArmadas = 0;
        Predicate<Campo> minado = c -> c.isMinado();

        do{
            int aleatorio = (int) (Math.random() * campos.size());
            minasArmadas = campos.stream().filter(minado).count();
            campos.get(aleatorio).minar();
        }while(minasArmadas < minas);

    }

    public boolean objetivoAlcancado(){
        return campos.stream().allMatch(c -> c.objetivoAlcancado());
    }

    public void reiniciar(){
        campos.stream().forEach(c -> c.reiniciar());
        sortearMinas();
    }

    @Override
    public void eventoOcorreu(Campo c, CampoEvento evento) {
        if(evento == CampoEvento.EXPLODIR){
            System.out.println("perdeu");
            notificarObservadores(false);
        }
        else if(objetivoAlcancado()){
            notificarObservadores(true);
        }
    }
}
