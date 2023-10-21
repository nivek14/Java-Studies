package Excecao;

public class ChecadaNaoChecada {

    public static void main(String[] args) {
        try{
            geraErro1();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        try{
            geraErro2();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("end");
    }

    // não checada
    static void geraErro1(){
        throw new RuntimeException("ocorreu um erro1");
    }

    // checada
    static void geraErro2() throws Exception{
        throw new Exception("ocorreu um erro2");
    }

}
