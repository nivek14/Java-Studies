import solutions.LC1;
import solutions.LC1716;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        LC1716 test1716 = new LC1716();
        LC1 test1 = new LC1();

        //System.out.println(test1716.totalMoney(20));
        System.out.println(Arrays.toString(test1.twoSum(new int[]{1,2,3,5,6,9,7,10}, 19)));

    }
}