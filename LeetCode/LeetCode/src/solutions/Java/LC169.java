package solutions.Java;

public class LC169 {

    public int majorityElement(int[] nums) {

        int times = 0;
        int auxTimes = 1;
        int value = 0;

        // esses dois laços para performance não é bom
        // está passando por elementos que não seria necessário passar novamente
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    auxTimes++;
                }
            }
            if(times < auxTimes){
                times = auxTimes;
                value = nums[i];
            }
            auxTimes = 1;
        }
        return  value;
    }
}