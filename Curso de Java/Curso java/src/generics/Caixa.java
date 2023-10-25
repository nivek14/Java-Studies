package generics;

public class Caixa<Tipo> {

    private Tipo coisa;

    public void aguardar(Tipo coisa){
        this.coisa = coisa;
    }

    public Tipo abrir(){
        return coisa;
    }

}
