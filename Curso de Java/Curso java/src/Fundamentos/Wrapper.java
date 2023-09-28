package Fundamentos;

public class Wrapper {
    public static void main(String[] args) {

        Byte    b = 100;
        Short   s = 1000;
        Integer i = 10000;
        Long    l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());
        System.out.println(i);
        System.out.println(l);

        Boolean     bo = Boolean.parseBoolean("true");
        Character   c = '#';

        Float   f = 123.0F;
        Double  d = 1234.0D;

    }
}
