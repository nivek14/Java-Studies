package solutions.Java;

public class LC1929 {

    public int[] getConcatenation(int[] nums) {

        int [] concArray = new int[nums.length * 2];
        int j = 0;

        for(int i = 0; i < concArray.length; i++){
            if(j >= nums.length) j = 0;
            concArray[i] = nums[j];
            j++;
        }

        return concArray;

    }

}
