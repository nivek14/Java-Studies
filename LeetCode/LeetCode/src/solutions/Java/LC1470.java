package solutions.Java;

import java.util.Arrays;

public class LC1470 {

    public int[] shuffle(int[] nums, int n) {

        if(nums.length != 2 * n) return null;

        int[] xArray = Arrays.copyOfRange(nums, 0, nums.length / 2);
        int[] yArray = Arrays.copyOfRange(nums, nums.length / 2, nums.length);
        int[] finalArray = new int[2*n];
        int j = 0;

        for(int i = 0; i < finalArray.length; i += 2){
            finalArray[i] = xArray[j];
            finalArray[i+1] = yArray[j];
            j++;
        }

        return finalArray;

    }

}
