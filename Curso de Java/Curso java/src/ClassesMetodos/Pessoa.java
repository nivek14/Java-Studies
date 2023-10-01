package ClassesMetodos;

public class Pessoa {

    double pesoPessoa;
    String nomePessoa;

    Pessoa(double pesoPessoa, String nomePessoa){
        this.pesoPessoa = pesoPessoa;
        this.nomePessoa = nomePessoa;
    }

    void PesoAtual(){
        System.out.println("Peso de " + this.nomePessoa +  "antes de comer: " + this.pesoPessoa);
    }

    void Comer(Comida comida){
        this.pesoPessoa += comida.pesoComida;
    }

}
