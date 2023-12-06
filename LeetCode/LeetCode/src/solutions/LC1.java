package solutions;

public class LC1 {

    public int[] twoSum(int[] nums, int target) {

        int calc;
        int [] values = new int[0];

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                calc = nums[i] + nums[j];
                if (calc == target) values = new int[]{i, j};
            }
        }

        return values;

    }

}