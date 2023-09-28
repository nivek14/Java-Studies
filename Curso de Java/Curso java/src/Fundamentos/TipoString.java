package Fundamentos;

public class TipoString {
    public static void main(String[] args) {
        String s = new String();
        s = "testes testes1";
        System.out.println(s.toLowerCase());
        System.out.println(s.toUpperCase());
        System.out.println(s.length());
        System.out.println(s.concat("teste2"));
    }
}
