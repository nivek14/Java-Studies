package solutions.Java;

public class LC1512 {

    public int numIdenticalPairs(int[] nums) {

        int count = 0;
        int i = 0;
        int j = 0;

        for(i = 0; i < nums.length; i++){
            for(j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]) count++;
            }
        }

        return count;

    }

}