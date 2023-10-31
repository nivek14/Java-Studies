package br.com.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {

    private enum TipoComando{
        ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA;
    };

    private static final Memoria instancia = new Memoria();
    private final List<MemoriaObservador> observadorList = new ArrayList<>();

    private TipoComando ulTimaOperacao = null;

    private boolean substituir = false;
    private String textoAtual = "";
    private String textoBuffer = "";

    private Memoria(){

    }

    public static Memoria getInstancia(){
        return instancia;
    }

    public void adicionarObservador(MemoriaObservador o){
        observadorList.add(o);
    }

    public String getTextoAtual(){
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }

    public void processarComando(String valor){

        TipoComando tipoComando = detectarTipoComando(valor);

        if(tipoComando == null){
            return;
        }
        else if(tipoComando == tipoComando.ZERAR){
            textoAtual = "";
            textoBuffer = "";
            substituir = false;
            ulTimaOperacao = null;
        }
        else if(tipoComando == TipoComando.NUMERO || tipoComando == tipoComando.VIRGULA){
            textoAtual = substituir ? valor : textoAtual + valor;
            substituir = false;
        }
        else{
            substituir = true;
            textoAtual = obterResultado();
            textoBuffer = textoAtual;
            ulTimaOperacao = tipoComando;
        }

        observadorList.forEach(o -> o.valorAlterado(getTextoAtual()));
    }

    private String obterResultado() {

        if(ulTimaOperacao == null || ulTimaOperacao == TipoComando.IGUAL){
            return textoAtual;
        }

        double numeroBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
        double numeroAtual  = Double.parseDouble(textoAtual.replace(",", "."));

        double resultado = 0;

        if(ulTimaOperacao == TipoComando.SOMA)      resultado = numeroBuffer + numeroAtual;
        else if(ulTimaOperacao == TipoComando.SUB)  resultado = numeroBuffer - numeroAtual;
        else if(ulTimaOperacao == TipoComando.MULT) resultado = numeroBuffer * numeroAtual;
        else if(ulTimaOperacao == TipoComando.DIV)  resultado = numeroBuffer / numeroAtual;

        String resultadoString = Double.toString(resultado).replace(",", ".");

        boolean inteiro = resultadoString.endsWith(",0");

        return inteiro ? resultadoString.replace(",0", "") : resultadoString;
    }

    private TipoComando detectarTipoComando(String valor) {

        if(textoAtual.isEmpty() && valor == "0") return null;

        try {
            Integer.parseInt(valor);
            return TipoComando.NUMERO;
        }catch (NumberFormatException e){
            if("AC".equals(valor))      return TipoComando.ZERAR;
            else if("/".equals(valor))  return TipoComando.DIV;
            else if("*".equals(valor))  return TipoComando.MULT;
            else if("+".equals(valor))  return TipoComando.SOMA;
            else if("-".equals(valor))  return TipoComando.SUB;
            else if("=".equals(valor))  return TipoComando.IGUAL;
            else if(",".equals(valor) && !textoAtual.contains(","))  return TipoComando.VIRGULA;
        }

        return null;

    }

}
