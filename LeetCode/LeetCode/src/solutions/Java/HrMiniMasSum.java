package solutions.Java;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class HrMiniMasSum {

    public static void miniMaxSum(List<Integer> arr){

        List<Integer> results = new ArrayList<>();
        int sum = 0;

        for(int i = 0; i < arr.size(); i++){
            for(int j = 0; j < arr.size(); j++){
                if(j != i){
                    sum += arr.get(j);
                }
            }

            results.add(Math.abs(sum));
            sum = 0;
        }

        System.out.println(results);
        System.out.println(Collections.min(results) + " " + Collections.max(results));

    }

}
