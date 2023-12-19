import solutions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Instâncias dos problemas
        LC1716  test1716    = new LC1716();
        LC1     test1       = new LC1();
        LC9     test9       = new LC9();
        LC67    test67      = new LC67();
        LC169   test169     = new LC169();
        LC1436  test1436    = new LC1436();
        LC191   test191     = new LC191();
        LC1929  test1919    = new LC1929();
        LC2469 test2469     = new LC2469();
        LC1108 test1108     = new LC1108();
        LC1512 test1512     = new LC1512();
        LC2011 test2011     = new LC2011();
        LC771 test771       = new LC771();
        LC1470 test1470     = new LC1470();

        // Entradas personalizadas
        ArrayList<List<String>> input1436 = new ArrayList<List<String>>();
        input1436.add(List.of(new String[]{"London", "New York"}));
        input1436.add(List.of(new String[]{"New York", "Lima"}));
        input1436.add(List.of(new String[]{"Lima", "SP"}));

        // Resultados
        //System.out.println(test1716.totalMoney(20));
        //System.out.println(Arrays.toString(test1.twoSum(new int[]{1,2,3,5,6,9,7,10}, 19)));
        //System.out.println(test9.isPalindrome(-121));
        //System.out.println(test67.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
        //System.out.println(test169.majorityElement(new int[]{2,2,1,1,1,2,2}));
        //System.out.println(test1436.destCity(input1436));
        //System.out.println(test191.hammingWeight(00000000000000000000000000001011 ));
        //System.out.println(Arrays.toString(test1919.getConcatenation(new int[]{1,3,2,1})));
        //System.out.println(Arrays.toString(test2469.convertTemperature(36.50)));
        //System.out.println(test1108.defangIPaddr("255.100.50.0"));
        //System.out.println(test1512.numIdenticalPairs(new int[]{1,2,3}));
        //System.out.println(test2011.finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
        //System.out.println(test771.numJewelsInStones("z", "ZZ"));
        System.out.println(Arrays.toString(test1470.shuffle(new int[]{1,1,2,2}, 2)));

    }
}