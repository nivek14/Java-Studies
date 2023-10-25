package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTest {

    public static void main(String[] args) {

        List<String> langs = Arrays.asList("test1", "test2", "test3");
        List<Integer> nums = Arrays.asList(1,2,3,4,5);

        // sem generics usando cast
        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);

        Integer ultimoNumero = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNumero);

        // com generics sem cast
        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimoNumero2 = ListaUtil.getUltimo2(nums);
        System.out.println(ultimoNumero2);


    }
}
