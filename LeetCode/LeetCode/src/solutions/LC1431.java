package solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> greatestNumberCandies = new ArrayList<>();
        int total;
        List<String> ans = new ArrayList<>();

        for(int i = 0; i < candies.length; i++){
            total = candies[i] + extraCandies;
            for(int j = 0; j < candies.length; j++){
               if(total >= candies[j]) ans.add("t");
               else ans.add("f");
            }
            if(ans.contains("f")) greatestNumberCandies.add(false);
            else greatestNumberCandies.add(true);
            ans.clear();
        }

        return greatestNumberCandies;

    }

}