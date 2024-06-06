package solutions.Java;

import java.util.List;

public class HrPlusMinus {

    public void plusMinus(List<Integer> arr){

        int positiveN = 0;
        int negativeN = 0;
        int zeroN = 0;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) > 0) positiveN++;
            else if(arr.get(i) < 0) negativeN++;
            else zeroN++;
        }

        System.out.printf("%.6f\n", Double.valueOf(positiveN) / Double.valueOf(arr.size()));
        System.out.printf("%.6f\n", Double.valueOf(negativeN) / Double.valueOf(arr.size()));
        System.out.printf("%.6f\n", Double.valueOf(zeroN) / Double.valueOf(arr.size()));
    }

}
