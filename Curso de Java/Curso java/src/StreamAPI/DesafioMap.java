package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DesafioMap {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);

        nums.stream().map(FuncoesMap.binario).map(FuncoesMap.inverte).map(FuncoesMap.inteiro).forEach(System.out::println);

    }

}
