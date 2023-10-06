package OrientacaoObjetos;

public class Pessoa {

   private int idade;

   Pessoa(int idade){
       setIdade(idade);
   }

   public int GetIdade(){
       return idade;
   }

   public void setIdade(int novaIdade){
       this.idade = novaIdade;
   }

}
