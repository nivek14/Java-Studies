package OrientacaoObjetos.ClassesAbstratas;

public class Cachorro extends Mamifero{

    @Override
    public String mover() {
        return "com as patas";
    }

    @Override
    public String mamar() {
        return "com leite";
    }
}
