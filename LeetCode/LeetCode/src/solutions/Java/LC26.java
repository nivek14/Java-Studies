package solutions.Java;

public class LC26 {
    // finalizar
    public int removeDuplicates(int[] nums) {

        int k;
        int [] newNums = new int[nums.length];
        int dinamycInex = 0;
        boolean flag = false;

        for(int i = dinamycInex; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                dinamycInex = j;
                if(nums[i] == nums[j] && flag == false){
                    newNums[i] = nums[i];
                    flag = true;
                }
            }
            flag = false;
        }

        return newNums.length;

    }

}
